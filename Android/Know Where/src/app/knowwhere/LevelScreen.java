package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelScreen extends Activity {

    Button esy, mdm, exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_screen);
        final Context cxt = this;
        esy = (Button) findViewById(R.id.lbtn1);
        mdm = (Button) findViewById(R.id.lbtn2);
        exp = (Button) findViewById(R.id.lbtn3);
        esy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ie1 = new Intent(cxt, Level_easy_1.class);
                startActivity(ie1);
            }
        });
        mdm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ie2 = new Intent(cxt, Level_med_1.class);
                startActivity(ie2);

            }
        });
        exp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ie3 = new Intent(cxt, Level_exp_1.class);
                startActivity(ie3);

            }
        });
    }

}
