package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_exp_3 extends Activity {
    final Context cnt11 = this;
    EditText plntxt11, mltxt11;
    Button btn11, chkbtn11;
    String info11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_exp_3);
        plntxt11 = (EditText) findViewById(R.id.plntxt11);
        mltxt11 = (EditText) findViewById(R.id.multxt11);
        btn11 = (Button) findViewById(R.id.lvlexpbtn3);
        btn11.setVisibility(View.INVISIBLE);
        chkbtn11 = (Button) findViewById(R.id.chkbtn11);
        info11 = "This is a HURRICANE IKE!!" + "\n" + "This is the hurricane Ike as seen on Sept. 10, 2008 in Galveston,Texas,USA.";
        chkbtn11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt11.getText().toString().equalsIgnoreCase("Ike Hurricane") || mltxt11.getText().toString().equalsIgnoreCase("Hurricane") && mltxt11.getText().toString() != " ") {

                    mltxt11.setText(info11);
                    btn11.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_exp_3.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it11 = new Intent(cnt11, Level_exp_4.class);
                startActivity(it11);

            }
        });

    }


}