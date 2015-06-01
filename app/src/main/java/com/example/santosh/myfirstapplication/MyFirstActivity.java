package com.example.santosh.myfirstapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MyFirstActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);
    }

public void myFirstMethod(View v) {
    //Make the string visible

    // Add Logging for debugging
    Log.i("MTAG-2000", "Method starts");

    View myTextView = findViewById(R.id.myFirstTextView);
    myTextView.setVisibility(View.VISIBLE);
}

}
