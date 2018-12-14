package com.example.smgue.materialdesign;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


public class StandaloneToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("Standalone toolbar!");
        mToolbar.setSubtitle("By SM Guellord");
//        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        /*//Compatibility by Java
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            mToolbar.setElevation(10f);
        }*/

        mToolbar.inflateMenu(R.menu.menu_main);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                String title = (String)menuItem.getTitle();
                Toast.makeText(StandaloneToolbar.this, title + " Selected!", Toast.LENGTH_LONG).show();

                switch (menuItem.getItemId()){

                    case R.id.save:
                        //Perform individual menu actions.
                        break;
                    case R.id.settings:
                        //Perform individual menu actions.
                        break;
                    case R.id.mail:
                        //Perform individual menu actions.
                        break;
                    case R.id.web_search:
                        //Perform individual menu actions.
                        break;
                    case R.id.help:
                        //Perform individual menu actions.
                        break;
                    case R.id.camera:
                        //Perform individual menu actions.
                        break;

                }

                return true;
            }
        });
    }
}
