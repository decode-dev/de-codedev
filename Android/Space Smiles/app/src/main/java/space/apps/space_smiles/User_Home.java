package space.apps.space_smiles;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class User_Home extends ActionBarActivity implements OnPageChangeListener {
	
	private Context context;
	private Upload_Image hf;
	private int uid;
	
	private volatile int checkstar = -1;
	
	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a {@link FragmentPagerAdapter}
	 * derivative, which will keep every loaded fragment in memory. If this
	 * becomes too memory intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.usr_home);
		context = this;
		
		Bundle extras = this.getIntent().getExtras();
		uid = extras.getInt("uid");

		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		mViewPager.setOnPageChangeListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the User_Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			if(position == 0) {
				hf = new Upload_Image();
				RequestTask rt = new RequestTask();
				rt.execute("getLast");
				return hf;
			} else if(position == 1) {
				User_Profile pf = new User_Profile();
				return pf;
			}
			return null;
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 2;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			/*Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return getString(R.string.title_section1).toUpperCase(l);
			case 1:
				return getString(R.string.title_section2).toUpperCase(l);
			case 2:
				return getString(R.string.title_section3).toUpperCase(l);
			}*/
			return null;
		}
	}


	class RequestTask extends AsyncTask<String, String, String> {

		@Override
		protected String doInBackground(String... params) {
			if(params[0].equals("getLast")) {
				String url_s = Login_Key.url;
				url_s = Login_Key.addParam(url_s, "function=getCustomPost");
				url_s = Login_Key.addParam(url_s, "num=5");
				try {
					URL url = new URL(url_s);
					HttpURLConnection huc = (HttpURLConnection) url.openConnection();
					InputStream is = new BufferedInputStream(huc.getInputStream());
					String res = Login_Key.convertStreamToString(is);
					
					JSONParser parser = new JSONParser();
					JSONObject obj = (JSONObject) parser.parse(res);
					String ids = (String) obj.get("ids").toString();
					String[] ida = ids.split(";");
					for(String id : ida) {
						doInBackground("getPost", id);
					}
					
					return res;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if(params[0].equals("getPost")) {
				String url_s = Login_Key.url;
				url_s = Login_Key.addParam(url_s, "function=getPost");
				url_s = Login_Key.addParam(url_s, "id=" + params[1]);
				try {
					URL url = new URL(url_s);
					HttpURLConnection huc = (HttpURLConnection) url.openConnection();
					InputStream is = new BufferedInputStream(huc.getInputStream());
					String res = Login_Key.convertStreamToString(is);
					
					JSONParser parser = new JSONParser();
					JSONObject post = (JSONObject) parser.parse(res);
					String post_s = post.get("post").toString();

					JSONObject postobj = (JSONObject) parser.parse(post_s);
					final int pid = Integer.parseInt(postobj.get("id").toString());
					final String username = postobj.get("fullname").toString();
					final String date = postobj.get("postdate").toString();
					final String desc = postobj.get("description").toString();
					final String stars = postobj.get("stars").toString();
					final String img = "http://localhost:8080/ssmiles/uploads/" + postobj.get("url").toString();
					//Here the link is given for localhost where the site is running.
					//I may be wrong here so u can edit as u wish.
					//The above key is also defined in api.php file.
					Bitmap bmp = null;
					try {
						InputStream in = new URL(img).openStream();
						bmp = BitmapFactory.decodeStream(in);
					} catch(Exception e) {
						e.printStackTrace();
					}
					final Bitmap rbmp = bmp;
					
					User_Home.this.runOnUiThread(new Runnable() {
						@Override
						public void run() {
							RequestTask rt = new RequestTask();
							rt.execute("checkStar", pid + "");
							while(checkstar == -1) {}
							
							LinearLayout homeroot = hf.getHome_root();
							
							LinearLayout.LayoutParams params = 
									new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
							params.setMargins(0, 0, 0, 30);
							
							final Image_Loaded pv = new Image_Loaded(context);
							pv.username_txt.setText(username);
							pv.date_txt.setText(date);
							pv.desc_txt.setText(desc);
							pv.stars_txt.setText(stars);
							pv.image.setImageBitmap(rbmp);
							
							if(checkstar == 1) {
								pv.star_img.setImageResource(R.drawable.staryellow);
								pv.star_img.setTag("on");
							} else {
								pv.star_img.setImageResource(R.drawable.star);
								pv.star_img.setTag("off");
							}
							
							pv.star_btn.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									if(pv.star_img.getTag().equals("on")) {
										RequestTask rt = new RequestTask();
										rt.execute("removeStar", pid + "");
										pv.star_img.setTag("off");
										pv.star_img.setImageResource(R.drawable.star);
										int new_val = Integer.parseInt(pv.stars_txt.getText().toString());
										new_val--;
										pv.stars_txt.setText(new_val + "");
									} else {
										RequestTask rt = new RequestTask();
										rt.execute("addStar", pid + "");
										pv.star_img.setTag("on");
										pv.star_img.setImageResource(R.drawable.staryellow);
										int new_val = Integer.parseInt(pv.stars_txt.getText().toString());
										new_val++;
										pv.stars_txt.setText(new_val + "");
									}
								}
							});
							
							pv.setLayoutParams(params);
							
							homeroot.addView(pv);
							
							checkstar = -1;
						}
					});
					
					return res;
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if(params[0] == "addStar") {
				String url_s = Login_Key.url;
				url_s = Login_Key.addParam(url_s, "function=addStar");
				url_s = Login_Key.addParam(url_s, "uid=" + uid);
				url_s = Login_Key.addParam(url_s, "pid=" + params[1]);
				try {
//					URL url = new URL(url_s);
//					HttpURLConnection huc = (HttpURLConnection) url.openConnection();
//					InputStream is = new BufferedInputStream(huc.getInputStream());
//					String res = Login_Key.convertStreamToString(is);
				} catch(Exception e) {
					e.printStackTrace();
				}
			} else if(params[0] == "removeStar") {
				String url_s = Login_Key.url;
				url_s = Login_Key.addParam(url_s, "function=removeStar");
				url_s = Login_Key.addParam(url_s, "uid=" + uid);
				url_s = Login_Key.addParam(url_s, "pid=" + params[1]);
				try {
//					URL url = new URL(url_s);
//					HttpURLConnection huc = (HttpURLConnection) url.openConnection();
//					InputStream is = new BufferedInputStream(huc.getInputStream());
//					String res = Login_Key.convertStreamToString(is);
				} catch(Exception e) {
					e.printStackTrace();
				}
			} else if(params[0] == "checkStar") {
				String url_s = Login_Key.url;
				url_s = Login_Key.addParam(url_s, "function=checkStar");
				url_s = Login_Key.addParam(url_s, "uid=" + uid);
				url_s = Login_Key.addParam(url_s, "pid=" + params[1]);
				try {
					URL url = new URL(url_s);
					HttpURLConnection huc = (HttpURLConnection) url.openConnection();
					InputStream is = new BufferedInputStream(huc.getInputStream());
					String res = Login_Key.convertStreamToString(is);
					
					JSONParser parser = new JSONParser();
					JSONObject post = (JSONObject) parser.parse(res);
					String result = post.get("result").toString();
					if(result.equals("1")) {
						checkstar = 1;
					} else {
						checkstar = 0;
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			return null;
		}
		
	}


	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		if(arg0 == 0) {
			hf.getHome_root().removeAllViews();

			RequestTask rt = new RequestTask();
			rt.execute("getLast");
		}
	}

}
