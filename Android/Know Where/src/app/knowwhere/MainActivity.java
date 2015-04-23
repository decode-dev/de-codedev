package app.knowwhere;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button pl, crd, hwt;
    Context cnt = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder adb = new AlertDialog.Builder(cnt);
        adb.setTitle("Welcome");
        adb.setMessage("We recommend to try 'How-To' tutorial." + "\n" + "Start Tutorial?");
        adb.setCancelable(false);
        adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent it13 = new Intent(cnt, How_to.class);
                startActivity(it13);
            }
        });
        adb.setNegativeButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog ad = adb.create();
        ad.show();
        pl = (Button) findViewById(R.id.msbtn1);

        crd = (Button) findViewById(R.id.msbtn3);
        hwt = (Button) findViewById(R.id.msbtn4);
        pl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(cnt, LevelScreen.class);
                startActivity(it);

            }
        });
        crd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(cnt, Credit.class);
                startActivity(int3);

            }
        });
        hwt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(cnt, How_to.class);
                startActivity(int4);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
