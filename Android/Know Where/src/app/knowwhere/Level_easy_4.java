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

public class Level_easy_4 extends Activity {
    final Context cnt4 = this;
    Button btn4, chkbtn4;
    EditText plntxt4, mltxt4;
    String info4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_easy_4);
        plntxt4 = (EditText) findViewById(R.id.plntxt4);
        mltxt4 = (EditText) findViewById(R.id.multxt4);
        info4 = "It is the SYDNEY OPERA HOUSE" + "\n" + "The Sydney Opera House is a multi-venue performing arts centre in Sydney. It is one of the modern wonders of the world";
        btn4 = (Button) findViewById(R.id.lvlesybtn4);
        btn4.setVisibility(View.INVISIBLE);
        chkbtn4 = (Button) findViewById(R.id.chkbtn4);
        chkbtn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt4.getText().toString().equalsIgnoreCase("Sydney Opera House") || mltxt4.getText().toString().equalsIgnoreCase("Opera House") && mltxt4.getText().toString() != " ") {

                    mltxt4.setText(info4);
                    btn4.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_easy_4.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb1 = new AlertDialog.Builder(cnt4);
                adb1.setTitle("Continue");
                adb1.setMessage("Do you want to continue to next Level?");
                adb1.setCancelable(false);
                adb1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent it4 = new Intent(cnt4, Level_med_1.class);
                        startActivity(it4);


                    }
                });
                adb1.setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                    }
                });
                AlertDialog ad = adb1.create();
                ad.show();

            }
        });
    }

}