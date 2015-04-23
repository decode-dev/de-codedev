package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_exp_4 extends Activity {
    final Context cnt12 = this;
    Button btn12, chkbtn12;
    EditText plntxt12, mltxt12;
    String info12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_exp_4);
        plntxt12 = (EditText) findViewById(R.id.plntxt12);
        mltxt12 = (EditText) findViewById(R.id.multxt12);
        btn12 = (Button) findViewById(R.id.lvlexpbtn4);
        btn12.setVisibility(View.INVISIBLE);
        chkbtn12 = (Button) findViewById(R.id.chkbtn12);
        info12 = "This is the MANAM VOLCANO ISLAND." + "\n" + "It is an island located in the Bismarck Sea across the Stephan Strait from Yawar on the northeast coast of mainland Papua New Guinea." + "If you look closely at the image,you can see the ash plumes from the volcano.";
        chkbtn12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt12.getText().toString().equalsIgnoreCase("Manam Volcano Island") || mltxt12.getText().toString().equalsIgnoreCase("Manam Volcano") && mltxt12.getText().toString() != " ") {

                    mltxt12.setText(info12);
                    btn12.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_exp_4.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it12 = new Intent(cnt12, Level_exp_5.class);
                startActivity(it12);

            }
        });
    }


}