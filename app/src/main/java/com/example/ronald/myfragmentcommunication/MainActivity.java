package com.example.ronald.myfragmentcommunication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements FragmentOne.FragmentOnClickListener {

    FragmentTwo fragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentTwo = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment2);

    }


    @Override
    public void FragmentOnClickListener(int position) {
        //fragmentTwo = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment2);
        fragmentTwo.setCount(position);

    }
}
