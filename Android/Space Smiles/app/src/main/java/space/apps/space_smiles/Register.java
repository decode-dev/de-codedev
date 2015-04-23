package space.apps.space_smiles;

import android.content.Context;
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

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Register extends ActionBarActivity implements OnClickListener {

	private Context context;
	private EditText flname_txt, usrname_txt, email_txt, pwd_txt, cnfrmpwd_txt;
	private Button register_btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usr_register);
		context = this;
		
		flname_txt = (EditText) findViewById(R.id.fullName_txt);
		usrname_txt = (EditText) findViewById(R.id.username_txt);
		email_txt = (EditText) findViewById(R.id.email_txt);
		pwd_txt = (EditText) findViewById(R.id.password_txt);
		cnfrmpwd_txt = (EditText) findViewById(R.id.confirmPassword_txt);
		
		register_btn = (Button) findViewById(R.id.register_btn);
		register_btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.register_btn:
			int error = 0;
			
			if(flname_txt.getText().toString().replace(" ", "").length() == 0) {
				error = 1;
			}
			if(usrname_txt.getText().toString().replace(" ", "").length() == 0) {
				error = 1;
			}
			if(email_txt.getText().toString().replace(" ", "").length() == 0) {
				error = 1;
			}
			if(pwd_txt.getText().toString().replace(" ", "").length() == 0) {
				error = 1;
			}
			if(cnfrmpwd_txt.getText().toString().replace(" ", "").length() == 0) {
				error = 1;
			}
			
			if(error == 1) {
				Toast.makeText(this, "Fill all required Information!", Toast.LENGTH_LONG).show();
				break;
			}
			
			if(!pwd_txt.getText().toString().equals(cnfrmpwd_txt.getText().toString())) {
				Toast.makeText(this, "Passwords do not match!"+"\n"+"Re-type the Password.", Toast.LENGTH_LONG).show();
				break;
			}
			
			RequestTask rt = new RequestTask();
			String flname = flname_txt.getText().toString();
			String usrname = usrname_txt.getText().toString();
			String email = email_txt.getText().toString();
			String md5 = "";
			
			MessageDigest md = null;
			try {
				md = MessageDigest.getInstance("MD5");
				byte[] digest = md.digest(pwd_txt.getText().toString().getBytes());
				BigInteger bi = new BigInteger(1, digest);
				md5 = bi.toString(16);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			
			rt.execute(flname, usrname, email, md5);
			
			break;
		}
	}
	
	class RequestTask extends AsyncTask<String, String, String> {

		@Override
		protected String doInBackground(String... params) {
			String result = "";
			
			String url_s = Login_Key.url;
			url_s = Login_Key.addParam(url_s, "function=sendReg");
			url_s = Login_Key.addParam(url_s, "name=" + params[0]);
			url_s = Login_Key.addParam(url_s, "username=" + params[1]);
			url_s = Login_Key.addParam(url_s, "email=" + params[2]);
			url_s = Login_Key.addParam(url_s, "password=" + params[3]);
			try {
				URL url = new URL(url_s);
				HttpURLConnection huc = (HttpURLConnection) url.openConnection();
				InputStream is = new BufferedInputStream(huc.getInputStream());
				String res = Login_Key.convertStreamToString(is);
				
				JSONParser parser = new JSONParser();
				JSONObject obj = (JSONObject) parser.parse(res);
				int success = Integer.parseInt(obj.get("success").toString());
				if(success == 0) {
					return "Username or E-mail already exists!";
				} else if(success == -1) {
					return "Database error!";
				} else if(success == 1) {
					return "Successful registration!"+"\n"+"Login to continue";
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return result;
		}

		@Override
		protected void onPostExecute(String result) {
			Toast.makeText(context, result, Toast.LENGTH_LONG).show();
			if(result.equals("Successful registration!"+"\n"+"Login to continue")) {
				finish();
			}
		}
		
	}
	
	
}
