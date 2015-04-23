package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_exp_1 extends Activity {
    final Context cnt9 = this;
    Button btn9, chkbtn9;
    EditText plntxt9, mltxt9;
    String info9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_exp_1);
        plntxt9 = (EditText) findViewById(R.id.plntxt9);
        mltxt9 = (EditText) findViewById(R.id.multxt9);
        btn9 = (Button) findViewById(R.id.lvlexpbtn1);
        btn9.setVisibility(View.INVISIBLE);
        info9 = "They are the ARLIT MINES located in Niger." + "\n" + "Trivia : Largest Uranium mine in the world";
        chkbtn9 = (Button) findViewById(R.id.chkbtn9);
        chkbtn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt9.getText().toString().equalsIgnoreCase("Arlit Mines") && mltxt9.getText().toString() != " ") {

                    mltxt9.setText(info9);
                    btn9.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_exp_1.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it9 = new Intent(cnt9, Level_exp_2.class);
                startActivity(it9);

            }
        });
    }

}



