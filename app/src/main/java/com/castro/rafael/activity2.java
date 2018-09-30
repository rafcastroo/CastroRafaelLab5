package com.castro.rafael;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class activity2 extends AppCompatActivity {


    private static final String TAG = activity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Log.i(TAG, "Inside OnCreate Method");

        Log.d(TAG, "Inside OnCreate Method");

        Log.e(TAG, "Inside OnCreate Method");
    }

    public void onButtonToAct1 (View v){
        if(v.getId() == R.id.act1diplay){
            Intent i = new Intent(activity2.this, MainActivity.class);
            startActivity(i);
        }
    }

    public void onLaunchCadlao (View v){

        Intent intent=null;
        Intent chooser=null;
        if(v.getId() == R.id.launchcadlao){
            intent =new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:11.187538, 119.394444"));
            chooser =Intent.createChooser(intent, "Launch Maps");
            startActivity(chooser);
        }
    }
}
