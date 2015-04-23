package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_exp_2 extends Activity {
    final Context cnt10 = this;
    Button btn10, chkbtn10;
    EditText plntxt10, mltxt10;
    String info10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_exp_2);
        plntxt10 = (EditText) findViewById(R.id.plntxt10);
        mltxt10 = (EditText) findViewById(R.id.multxt10);
        btn10 = (Button) findViewById(R.id.lvlexpbtn2);
        btn10.setVisibility(View.INVISIBLE);
        chkbtn10 = (Button) findViewById(R.id.chkbtn10);
        info10 = "This is the 'Angkor Wat'." + "\n" + "It was first a Hindu, then subsequently a Buddhist, temple complex in Cambodia and the largest religious monument in the world.";
        chkbtn10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt10.getText().toString().equalsIgnoreCase("Angkor Wat") && mltxt10.getText().toString() != " ") {

                    mltxt10.setText(info10);
                    btn10.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_exp_2.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it10 = new Intent(cnt10, Level_exp_3.class);
                startActivity(it10);

            }
        });
    }


}