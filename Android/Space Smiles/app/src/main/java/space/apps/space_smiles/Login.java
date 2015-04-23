package space.apps.space_smiles;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Login extends ActionBarActivity implements OnClickListener {
	
	private Context context;
	private Button register_btn, login_btn ;
	private EditText username_txt, password_txt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
//	    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//	    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.usr_login);
		
		context = this;
		
		login_btn = (Button) findViewById(R.id.login_btn);
		login_btn.setOnClickListener(this);
		register_btn = (Button) findViewById(R.id.register_btn);
		
		username_txt = (EditText) findViewById(R.id.username_txt);
		password_txt = (EditText) findViewById(R.id.password_txt);
		
		login_btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		switch(v.getId())
		{
		case R.id.login_btn:
			String username = username_txt.getText().toString();
			String password = password_txt.getText().toString();
			String md5;
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				byte[] digest = md.digest(password.getBytes());
				BigInteger bi = new BigInteger(1, digest);
				md5 = bi.toString(16);
				
				RequestTask rt = new RequestTask();
				rt.execute(username, md5, "");
			} catch (NoSuchAlgorithmException e)
			{
				e.printStackTrace();
			}
			break;
		
		case R.id.register_btn:
			Intent i = new Intent(this, Register.class);
			startActivity(i);
			break;
		}
	}
	
	class RequestTask extends AsyncTask<String, String, String>
	{

		@Override
		protected String doInBackground(String... params)
		{
			String result = "";

			String url_s = Login_Key.url;
			url_s = Login_Key.addParam(url_s, "function=checkLogin");
			url_s = Login_Key.addParam(url_s, "username=" + params[0]);
			url_s = Login_Key.addParam(url_s, "md5=" + params[1]);
			try {
				URL url = new URL(url_s);
				HttpURLConnection huc = (HttpURLConnection) url.openConnection();
				String res = readStream(huc.getInputStream());
				result = res;
			} catch (Exception e)
			{
				e.printStackTrace();
			}

			return result;
		}

		@Override
		protected void onPostExecute(String res) {
			JSONParser parser = new JSONParser();
			JSONObject obj = null;
			if (res != null) {
				try {
					obj = (JSONObject) parser.parse(res);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				String result = (String) obj.get("result").toString();

				int r = Integer.parseInt(result);
				if (r == 1) {
					int uid = Integer.parseInt(obj.get("id").toString());
					Bundle b = new Bundle();
					b.putInt("uid", uid);
					Intent i = new Intent(context, User_Home.class);
					i.putExtras(b);
					startActivity(i);
					finish();
				} else {
					Toast.makeText(context, "Invalid username or password!", Toast.LENGTH_LONG).show();
				}

			} else
			{
				Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_LONG);
			}

		}
	}

	private String readStream(InputStream in)
	{
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(in));
			String line = "";
			while ((line = reader.readLine()) != null)
			{
				return line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
