package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_med_3 extends Activity {
    final Context cnt7 = this;
    Button btn7, chkbtn7;
    EditText plntxt7, mltxt7;
    String info7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_med_3);
        plntxt7 = (EditText) findViewById(R.id.plntxt7);
        mltxt7 = (EditText) findViewById(R.id.multxt7);
        btn7 = (Button) findViewById(R.id.lvlmedbtn3);
        btn7.setVisibility(View.INVISIBLE);
        chkbtn7 = (Button) findViewById(R.id.chkkbtn7);
        info7 = "It is the Giza Plateau!" + "\n" + "Located in Giza,Egypt, it is characterized by a sandy, desert climate and terrain with little vegetation." + "\n" + "If you look closely at the image, you can identify the famous Giza 'Pyramids' ";
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it7 = new Intent(cnt7, Level_med_4.class);
                startActivity(it7);

            }
        });
        chkbtn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt7.getText().toString().equalsIgnoreCase("Giza Plateau") || mltxt7.getText().toString().equalsIgnoreCase("Pyramids") && mltxt7.getText().toString() != " ") {

                    mltxt7.setText(info7);
                    btn7.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_med_3.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
