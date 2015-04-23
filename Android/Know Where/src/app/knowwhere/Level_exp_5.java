package app.knowwhere;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Level_exp_5 extends Activity {
    final Context cnt13 = this;
    Button btn13, chkbtn13;
    EditText plntxt13, mltxt13;
    String info13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_exp_5);
        plntxt13 = (EditText) findViewById(R.id.plntxt13);
        mltxt13 = (EditText) findViewById(R.id.multxt13);
        btn13 = (Button) findViewById(R.id.lvlexpbtn5);
        btn13.setVisibility(View.INVISIBLE);
        chkbtn13 = (Button) findViewById(R.id.chkbtn13);
        info13 = "This is MISSISSIPPI RIVER" + "\n" + "The Mississippi River is the chief river of the largest drainage system in North America" + "\n" + "Trivia : This is where the novel Tom Sawyer was set.";
        chkbtn13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt13.getText().toString().equalsIgnoreCase("Mississippi River") || mltxt13.getText().toString().equalsIgnoreCase("River Mississippi") && mltxt13.getText().toString() != " ") {

                    mltxt13.setText(info13);
                    btn13.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_exp_5.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder adb3 = new AlertDialog.Builder(cnt13);
                adb3.setTitle("Completed");
                adb3.setMessage("Thank You for playing our App" + "\n" + "Play Again");

                adb3.setCancelable(false);
                adb3.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent it13 = new Intent(cnt13, LevelScreen.class);
                        startActivity(it13);
                    }
                });
                adb3.setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                    }
                });
                AlertDialog ad = adb3.create();
                ad.show();

            }


        });
    }

}
