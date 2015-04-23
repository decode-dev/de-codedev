package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Nti_1 extends Activity {
    Button btn1;
    EditText mltxt1;
    Context ct1 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nti1);
        String info1 = "In 2012 and 2013, fires burned areas on both sides of the Tanana River south of Fairbanks, Alaska." + "The red areas  of the images are the scars left by the Dry Creek Fire.";
        mltxt1 = (EditText) findViewById(R.id.ntimltxt1);
        mltxt1.setText(info1);
        btn1 = (Button) findViewById(R.id.ntibtn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ntit1 = new Intent(ct1, Nti_2.class);
                startActivity(ntit1);

            }
        });
    }

}
