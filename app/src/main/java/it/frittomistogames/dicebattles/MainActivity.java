package it.frittomistogames.dicebattles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //nasconde la titleBar e la appBar
        setContentView(R.layout.activity_main);
    }
}