package com.castro.rafael;


import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Inside OnCreate Method");

        Log.d(TAG, "Inside OnCreate Method");

        Log.e(TAG, "Inside OnCreate Method");

    }

    public void onButtonToAct2 (View v){
        if(v.getId() == R.id.act2diplay){
            Intent i = new Intent(MainActivity.this, activity2.class);
            startActivity(i);
        }
    }

    public void onButtonCalaan (View v){

        Intent intent=null;
        Intent chooser=null;
        if(v.getId() == R.id.launchcalaan){
            intent =new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:11.190008, 119.396436"));
            chooser =Intent.createChooser(intent, "Launch Maps");
            startActivity(chooser);
        }
    }


}
