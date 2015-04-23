package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_easy_3 extends Activity {
    final Context cnt3 = this;
    EditText plntxt3, mltxt3;
    ;
    Button btn3, chkbtn3;
    String info3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_easy_3);
        plntxt3 = (EditText) findViewById(R.id.plntxt3);
        mltxt3 = (EditText) findViewById(R.id.multxt3);
        btn3 = (Button) findViewById(R.id.lvlesybtn3);
        btn3.setVisibility(View.INVISIBLE);
        chkbtn3 = (Button) findViewById(R.id.chkbtn3);
        info3 = "It is the EIFFEL TOWER" + "\n" + "The Eiffel Tower is an iron lattice tower located on the Champ de Mars in Paris. It was named after the engineer Gustave Eiffel.";
        chkbtn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt3.getText().toString().equalsIgnoreCase("Eiffel Tower") && mltxt3.getText().toString() != " ") {

                    mltxt3.setText(info3);
                    btn3.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_easy_3.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it3 = new Intent(cnt3, Level_easy_4.class);
                startActivity(it3);

            }
        });
    }

}
