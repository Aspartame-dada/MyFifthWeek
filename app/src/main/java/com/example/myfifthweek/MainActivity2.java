package com.example.myfifthweek;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity2";
    private BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        bnView = (BottomNavigationView) findViewById(R.id.bn_view);
        NavController navController = Navigation.findNavController(this,R.id.fragment);
        AppBarConfiguration configuration=new AppBarConfiguration.Builder(bnView.getMenu()).build();
        NavigationUI.setupActionBarWithNavController(this,navController,configuration);
        NavigationUI.setupWithNavController(bnView,navController);
    }

}