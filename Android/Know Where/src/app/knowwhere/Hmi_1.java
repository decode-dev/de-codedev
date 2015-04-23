package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Hmi_1 extends Activity {
    Button btn5;
    EditText mltxt5;
    Context ct5 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmi1);
        String info5 = "The pics show the impact of agriculturisation in Aimogasta,Argentina." + "\n" + "The green shades in the second pic are the region of agriculture.";
        mltxt5 = (EditText) findViewById(R.id.hmimtxt1);
        mltxt5.setText(info5);
        btn5 = (Button) findViewById(R.id.hmibtn1);
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ntit5 = new Intent(ct5, Hmi_2.class);
                startActivity(ntit5);

            }
        });
    }

}
