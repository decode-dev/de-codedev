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

public class Level_med_4 extends Activity {
    final Context cnt8 = this;
    Button btn8, chkbtn8;
    EditText plntxt8, mltxt8;
    String info8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_med_4);
        plntxt8 = (EditText) findViewById(R.id.plntxt8);
        mltxt8 = (EditText) findViewById(R.id.multxt8);
        btn8 = (Button) findViewById(R.id.lvlmedbtn4);
        btn8.setVisibility(View.INVISIBLE);
        info8 = "This is the Namib desert." + "\n" + "It is a coastal desert in southern Africa." + "If you look closely at the satellite image above which was taken by MODIS,you can see the desert.";
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder adb2 = new AlertDialog.Builder(cnt8);
                adb2.setTitle("Continue");
                adb2.setMessage("Do you want to continue to next Level?");
                adb2.setCancelable(false);
                adb2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent it8 = new Intent(cnt8, Level_exp_1.class);
                        startActivity(it8);
                    }
                });
                adb2.setNegativeButton("No", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                    }
                });
                AlertDialog ad = adb2.create();
                ad.show();

            }
        });
        chkbtn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mltxt8.getText().toString().equalsIgnoreCase("Namib desert") && mltxt8.getText().toString() != " ") {

                    mltxt8.setText(info8);
                    btn8.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(Level_med_4.this, "Sorry Wrong Answer/Incorrect Spelling.Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

}
