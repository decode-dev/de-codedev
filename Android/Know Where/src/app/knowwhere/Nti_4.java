package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Nti_4 extends Activity {
    Button btn4;
    EditText mltxt4;
    Context ct4 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nti4);
        String info4 = "Mount St. Helens in southeastern Washington state suffered a massive eruption in 1980." + "\n" + "LeftPic:Shows the region before the eruption." + "\n" + "CenterPic:Lava and Ash engulfed much of the surrounding landscape." + "\n" + "RightPic:The region is largely recovered by forests." + "\n" + "Green:-Fauna,Brown:- The hardened lava,White:-The ash.";
        mltxt4 = (EditText) findViewById(R.id.ntimltxt4);
        mltxt4.setText(info4);
        btn4 = (Button) findViewById(R.id.ntibtn4);
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ntit4 = new Intent(ct4, Hmi_1.class);
                startActivity(ntit4);

            }
        });
    }

}
