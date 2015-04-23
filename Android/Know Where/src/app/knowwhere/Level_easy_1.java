package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_easy_1 extends Activity {

    static String info1;
    final Context cnt1 = this;
    EditText pltxt1, mltxt1;
    Button btn1, chckbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_easy_1);
        btn1 = (Button) findViewById(R.id.lvlesybtn1);
        btn1.setVisibility(View.INVISIBLE);
        chckbtn1 = (Button) findViewById(R.id.chkbtn1);

        pltxt1 = (EditText) findViewById(R.id.plntxt1);
        mltxt1 = (EditText) findViewById(R.id.multxt1);
        info1 = "It is the TAJ MAHAL." + "\n" + "Taj Mahal is widely recognized as The jewel of Muslim art in India and one of the universally admired masterpieces of the world's heritage.";

        chckbtn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt1.getText().toString().equalsIgnoreCase("Taj Mahal") && mltxt1.getText().toString() != " ") {
                    mltxt1.setText(info1);
                    btn1.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_easy_1.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(cnt1, Level_easy_2.class);
                startActivity(it1);
            }
        });

    }


}