package space.apps.space_smiles;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("deprecation")
public class Image_Description extends ActionBarActivity implements OnClickListener {

	private ImageView img_vw;
	private EditText desc_txt;
	private Button post_btn;
	private String img_path, b64;
	
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abt_image_desc);
		context = this;
		
		img_vw = (ImageView) findViewById(R.id.imgprev);
		desc_txt = (EditText) findViewById(R.id.desc_txt);
		post_btn = (Button) findViewById(R.id.post_btn);
		post_btn.setOnClickListener(this);
		
		Bundle extras = this.getIntent().getExtras();
		img_path = extras.getString("imgpath");
		
        Bitmap bm1 = BitmapFactory.decodeFile(img_path);
        float ratio = Math.min(1200f / bm1.getWidth(), 1200f / bm1.getHeight());
        Bitmap bm = getResizedBitmap(bm1, (int) (bm1.getHeight() * ratio), (int) (bm1.getWidth() * ratio));
        ByteArrayOutputStream bas = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.JPEG, 100, bas); //bm is the bitmap object
        byte[] b = bas.toByteArray();
        b64 = Base64.encodeToString(b, Base64.DEFAULT);
		
		img_vw.setImageBitmap(bm);
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.post_btn) {			
			RequestTask rt = new RequestTask();
			rt.execute(b64, desc_txt.getText().toString());
		}
	}
	
	public Bitmap getResizedBitmap(Bitmap bm, int newHeight, int newWidth) {
		
		
	    int width = bm.getWidth();
	    int height = bm.getHeight();
	    float scaleWidth = ((float) newWidth) / width;
	    float scaleHeight = ((float) newHeight) / height;

	    // Create a matrix for the manipulation
	    Matrix matrix = new Matrix();

	    // Resize the bit map
	    matrix.postScale(scaleWidth, scaleHeight);
	    matrix.postRotate(90f);

	    // Recreate the new Bitmap
	    Bitmap resizedBitmap = Bitmap.createBitmap(bm, 0, 0, width, height, matrix, false);
	    return resizedBitmap;

	}
	
	class RequestTask extends AsyncTask<String, String, String> {

		@SuppressWarnings("deprecation")
		@Override
		protected String doInBackground(String... params) {
			HttpClient c = new DefaultHttpClient();
			HttpPost post = new HttpPost(Login_Key.url + "&function=addPost");
			try {
		        // Add your data
		        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(3);
		        nameValuePairs.add(new BasicNameValuePair("uid", "1"));
		        nameValuePairs.add(new BasicNameValuePair("img", params[0]));
		        nameValuePairs.add(new BasicNameValuePair("description", params[1]));
		        post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		        return "good";
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			return "bad";
		}

		@Override
		protected void onPostExecute(String result) {
			if(result.equals("good")) {
				Toast.makeText(context, "Success!", Toast.LENGTH_SHORT).show();
				finish();
			} else {
				Toast.makeText(context, "ERROR!", Toast.LENGTH_SHORT).show();
				finish();
			}
		}
		
	}
	
}
