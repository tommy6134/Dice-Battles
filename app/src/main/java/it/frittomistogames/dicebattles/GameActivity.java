package it.frittomistogames.dicebattles;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.media.Image;
import android.os.Bundle;
import android.view.WindowManager;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //nasconde la titleBar e la appBar
        setContentView(R.layout.activity_game);
    }

    //Variabiili
    int finalScoreP1 = 0, finalScoreP2 = 0, totalGames = 1; //Stats finali
    int partialScoreP1 = 0, partialScoreP2 = 0, currentTurn = 1; //Stats parziali

    //Funzioni
    public int randomNumber() {
        //Passare il numero di dadi come parametro e quindi modificare 'maxValue' (1 dado = 6 / 2 dadi = 12 / 3 dadi = 18)
        Random random = new Random();
        int maxValue = 6;

        return random.nextInt(maxValue + 1);
    }

    //Funzione che restituisca il/i dado/i graficamente (utilizzando gli assets accordati)

}