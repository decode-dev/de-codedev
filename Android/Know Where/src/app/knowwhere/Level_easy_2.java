package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Level_easy_2 extends Activity {
    final Context ctn2 = this;
    Button btn2, chkbtn2;
    EditText plntxt2, mltxt2;
    ImageView iv2;
    String info2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_easy_2);
        btn2 = (Button) findViewById(R.id.lvlesybtn2);
        btn2.setVisibility(View.INVISIBLE);
        plntxt2 = (EditText) findViewById(R.id.plntxt2);
        mltxt2 = (EditText) findViewById(R.id.multxt2);
        chkbtn2 = (Button) findViewById(R.id.chkbtn2);
        info2 = "It is the ROMAN COLOSSEUM." + "The colosseum is the largest amphitheatre of the Roman Empire, and is considered one of the greatest works of Roman architecture and engineering.";

        chkbtn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt2.getText().toString().equalsIgnoreCase("Colosseum") && mltxt2.getText().toString() != " ") {

                    mltxt2.setText(info2);
                    btn2.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_easy_2.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it2 = new Intent(ctn2, Level_easy_3.class);
                startActivity(it2);

            }
        });
    }

}