package com.andhradroid.testfrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new HomeFragment())
                    .commit();
        }
    }

    @Override
    public void onBackPressed() {
        //
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.container);
        //
        if (fragment instanceof HomeFragment
                && (((HomeFragment) fragment).onBackPressed())) {
            //
        } else {
            //Destroy Activiey
            super.onBackPressed();
        }

    }
}
