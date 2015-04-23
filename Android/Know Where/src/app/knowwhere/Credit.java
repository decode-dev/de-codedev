package app.knowwhere;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class Credit extends Activity {
    EditText cdtxt1, cdtxt2, cdtxt3, cdtxt4, cdtxt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);
        cdtxt1 = (EditText) findViewById(R.id.cdtxt1);
        cdtxt2 = (EditText) findViewById(R.id.cdtxt2);
        cdtxt3 = (EditText) findViewById(R.id.cdtxt3);
        cdtxt4 = (EditText) findViewById(R.id.cdtxt4);
        cdtxt5 = (EditText) findViewById(R.id.cdtxt5);
        String txt1 = "PROGRAMMING" + "\n" + "&" + "\n" + "DESIGNING HEAD";
        cdtxt1.setText(txt1);
        String txt2 = "UMK DIKSHIT";
        cdtxt2.setText(txt2);
        String txt3 = "DATA & INFORMATION";
        cdtxt3.setText(txt3);
        String txt4 = "JOHN BENEDICT";
        cdtxt4.setText(txt4);
        String txt5 = "NAAGARJUNA ATLURI";
        cdtxt5.setText(txt5);


    }

}
