package com.example.tonmo.layoutinflatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pre set class so we can only reference it .can create new object
        //out of it.this helps to create java view objects without xml references.
        LayoutInflater layoutInflater = getLayoutInflater();
        //view holds the view or the button that will be inflate and
        //in the parameter (int resource,ViewGroup parent) resource is the
        // subview that will be inflated and parent is the parent view of that subview
        // and can be set to null
        View view = layoutInflater.inflate(R.layout.sub_layout,null);
        RelativeLayout rltv = (RelativeLayout)findViewById(R.id.activity_main);
        // view was the inflated button that was set to the
        // relative layout by addView
        rltv.addView(view);
    }
}
