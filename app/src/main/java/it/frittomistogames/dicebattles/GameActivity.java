package it.frittomistogames.dicebattles;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.WindowManager;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //nasconde la titleBar e la appBar
        setContentView(R.layout.activity_game);
    }

    public int randomNumber() {
        Random random = new Random();
        int maxValue = 6;

        return random.nextInt(maxValue + 1);
    }
}