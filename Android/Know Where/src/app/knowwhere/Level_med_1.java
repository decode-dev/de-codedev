package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_med_1 extends Activity {
    final Context cnt5 = this;
    Button btn5, chkbtn5;
    EditText plntxt5, mltxt5;
    String info5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_med_1);
        plntxt5 = (EditText) findViewById(R.id.plntxt5);
        mltxt5 = (EditText) findViewById(R.id.multxt5);
        chkbtn5 = (Button) findViewById(R.id.chkbtn5);
        btn5 = (Button) findViewById(R.id.lvlmedbtn1);
        btn5.setVisibility(View.INVISIBLE);
        info5 = "Image of Galesnjak (Island of Love)!!" + "\n" + "It is located in the Pasman channel of the Adriatic, between the islands of Pasman and the town of Turanj on mainland Croatia.";
        chkbtn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt5.getText().toString().equalsIgnoreCase("Island of Love") || mltxt5.getText().toString().equalsIgnoreCase("Love Island") && mltxt5.getText().toString() != " ") {

                    mltxt5.setText(info5);
                    btn5.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_med_1.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it5 = new Intent(cnt5, Level_med_2.class);
                startActivity(it5);

            }
        });
    }

}
