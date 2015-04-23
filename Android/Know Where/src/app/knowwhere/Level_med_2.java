package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_med_2 extends Activity {
    final Context cnt6 = this;
    Button btn6, chkbtn6;
    EditText plntxt6, mltxt6;
    String info6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_med_2);
        plntxt6 = (EditText) findViewById(R.id.plntxt6);
        mltxt6 = (EditText) findViewById(R.id.multxt6);
        btn6 = (Button) findViewById(R.id.lvlmedbtn2);
        btn6.setVisibility(View.INVISIBLE);
        chkbtn6 = (Button) findViewById(R.id.chkbtn6);
        info6 = "Great Barrier Reef of Australia." + "\n" + "World's largest Coral Reef system composed of over 2,900 individual reefs and 900 islands stretching for over 2,300 kilometres (1,400 mi) over an area of approx.344,400 square kms";
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it6 = new Intent(cnt6, Level_med_3.class);
                startActivity(it6);

            }
        });
        chkbtn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt6.getText().toString().equalsIgnoreCase("Great Barrier Reef") || mltxt6.getText().toString().equalsIgnoreCase("Barrier Reef") && mltxt6.getText().toString() != " ") {

                    mltxt6.setText(info6);
                    btn6.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_med_2.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
