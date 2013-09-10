package com.deltaprogram.lldossier;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView mDisplayName;
    public Button button;
    TextView mTextView;
    String mName;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button morebutton = (Button)findViewById(R.id.more_button);

       morebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),AppPage.class);
                startActivity(i);
                finish();

            }
        });

        mTextView = (TextView)findViewById(R.id.mNameImput);

        mName ="Tom Fifelski";
        mTextView.setText(mName);

        mTextView = (TextView)findViewById(R.id.info);
        mName ="I have a an unquenchable thirst for knowlegde combined with the work ethic of an old Farmer." +
                " I understand that flexablity is key to deveoplment and am willing to learn. " +
                "I hope to further my knowlege and career and become the very best at what ever I am involved in.";

        mTextView.setText(mName);

        mTextView = (TextView)findViewById(R.id.contact);

        mName ="ThomasFifelski@    gmail.com" + "               phone:     269-491-1872";
        mTextView.setText(mName);





        button = (Button)findViewById(R.id.BarTalk);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent("android.Intent.action_MAIN");
                ComponentName iComponentName = new ComponentName("com.Delta.myapplication","com.Delta.myapplication.FullscreenActivity");
                mIntent.setComponent (iComponentName);
                startActivity(mIntent);
                finish();

            }


    });

}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;}



}