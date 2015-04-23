package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Hmi_3 extends Activity {
    Button btn7;
    EditText mltxt7;
    Context ct7 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmi3);
        mltxt7 = (EditText) findViewById(R.id.hmimltxt3);
        String info7 = "The pics show the urbanisation of Nassau,Bahamas between December 15,1975 and September 19,2006." + "\n" + "Notice the increase in the number of buildings in the second pic.";
        mltxt7.setText(info7);
        btn7 = (Button) findViewById(R.id.hmibtn3);
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ntit7 = new Intent(ct7, Hmi_4.class);
                startActivity(ntit7);

            }
        });
    }

}