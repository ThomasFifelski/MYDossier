package com.deltaprogram.lldossier;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
/**
 * Created by tom on 8/18/13.
 */
public class AppPage extends Activity {
    TextView mTextView;
    String mName;

    String[] appsArray = {"Bartalk","tomintents","more cool apps"};

    private ListView appListView;

    private ArrayAdapter arrayAdapter;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resume);


        appListView = (ListView) findViewById(R.id.list_Apps);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, appsArray);

        // By using setAdapter method, you plugged the ListView with adapter
        appListView.setAdapter(arrayAdapter);



            Button bioButton = (Button)findViewById(R.id.bio_button);
            bioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }




        });

        {  mTextView = (TextView)findViewById(R.id.mFirstLast);

        mName ="Hey I'm Tom and here's some of my project. I hope you like them. Check them out.";
        mTextView.setText(mName);}



        appListView =(ListView)findViewById(R.id.list_Apps);

        appListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent("android.Intent.action_MAIN");
                ComponentName iComponentName = new ComponentName("com.Delta.myapplication","com.Delta.myapplication.FullscreenActivity");
                mIntent.setComponent (iComponentName);
                startActivity(mIntent);
                finish();
            }
        });
    }






}














