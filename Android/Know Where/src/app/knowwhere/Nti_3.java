package app.knowwhere;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Nti_3 extends Activity {
    Button btn3;
    EditText mltxt3;
    Context ct3 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nti3);
        String info3 = "Missouri river flowing between Rocky mountains in Montana." + "\n" + "e can see that there is less amount of water flowing in the latter pic ,the blue color is water.";
        mltxt3 = (EditText) findViewById(R.id.ntimltxt3);
        mltxt3.setText(info3);
        btn3 = (Button) findViewById(R.id.ntibtn3);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ntit3 = new Intent(ct3, Nti_4.class);
                startActivity(ntit3);

            }
        });
    }

}
