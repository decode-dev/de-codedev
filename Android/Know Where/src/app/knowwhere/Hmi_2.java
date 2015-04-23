package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Hmi_2 extends Activity {
    Button btn6;
    EditText mltxt6;
    Context ct6 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmi2);
        String info6 = "The pics show the impact of agriculturisation in Aimogasta,Argentina." + "\n" + "The green shades in the second pic are the region of agriculture.";
        mltxt6 = (EditText) findViewById(R.id.hmimltxt2);
        mltxt6.setText(info6);
        btn6 = (Button) findViewById(R.id.hmibtn2);
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ntit6 = new Intent(ct6, Hmi_3.class);
                startActivity(ntit6);

            }
        });
    }

}
