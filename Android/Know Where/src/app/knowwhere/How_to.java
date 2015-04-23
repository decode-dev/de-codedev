package app.knowwhere;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class How_to extends Activity {
    Context hcnt = this;
    Button nti, hmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to);
        AlertDialog.Builder adb = new AlertDialog.Builder(hcnt);
        adb.setTitle("Welcome");
        adb.setMessage("Welcome to the Tutorial." + "\n" + "Here you can learn about various Images and there description" + "\n" + "Continue?");

        adb.setCancelable(false);
        adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent hit1 = new Intent(hcnt, Nti_1.class);
                startActivity(hit1);
            }
        });
        adb.setNegativeButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent hit2 = new Intent(hcnt, MainActivity.class);
                startActivity(hit2);

            }
        });
        AlertDialog ad = adb.create();
        ad.show();
        nti = (Button) findViewById(R.id.hwtslct1);
        hmi = (Button) findViewById(R.id.hwtslct2);
        nti.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ht1 = new Intent(hcnt, Nti_1.class);
                startActivity(ht1);

            }
        });
        hmi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ht2 = new Intent(hcnt, Hmi_1.class);
                startActivity(ht2);

            }
        });
    }

}
