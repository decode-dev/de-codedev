package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Hmi_4 extends Activity {
    Button btn8;
    EditText mltxt8;
    Context ct8 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmi4);
        mltxt8 = (EditText) findViewById(R.id.hmimltxt4);
        String info8 = "The pics show the urbanisation of Nassau,Bahamas between December 15,1975 and September 19,2006." + "\n" + "Notice the increase in the number of buildings in the second pic.";
        mltxt8.setText(info8);
        btn8 = (Button) findViewById(R.id.hmibtn4);
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ntit8 = new Intent(ct8, How_to.class);
                startActivity(ntit8);

            }
        });
    }

}
