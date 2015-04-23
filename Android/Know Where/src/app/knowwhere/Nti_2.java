package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Nti_2 extends Activity {
    Button btn2;
    EditText mltxt2;
    Context ct2 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nti2);
        String info2 = "Hurricane Isaac made landfall in Louisiana on August 28, 2012, and moved very slowly north." + "\n" + "We can see that the dark tones show saturated land and the lighter blue tones of the two lakes represent turbid water and sediment flow.";
        mltxt2 = (EditText) findViewById(R.id.ntimltxt2);
        mltxt2.setText(info2);
        btn2 = (Button) findViewById(R.id.ntibtn2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ntit3 = new Intent(ct2, Nti_3.class);
                startActivity(ntit3);

            }
        });
    }

}
