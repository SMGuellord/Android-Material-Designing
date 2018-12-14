package com.example.smgue.materialdesign;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Check if we're running on Android 5.0 or higher
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            //call some material design API here
        }else{
            //Implement this feature without material design
        }
    }

    public void showToolbarAsActionbar(View view){
        Intent intent = new Intent (this, ActionBarToolbar.class);
        startActivity(intent);
    }

    public void showStandaloneToolbar(View view){
        Intent intent = new Intent(this, StandaloneToolbar.class);
        startActivity(intent);
    }

    public void showContextualMenu(View view){
        Intent intent = new Intent(this, ContextualMenu.class);
        startActivity(intent);
    }
}
