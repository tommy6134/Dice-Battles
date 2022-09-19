package it.frittomistogames.dicebattles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class GameConfigurationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //nasconde la titleBar e la appBar
        setContentView(R.layout.activity_game_configuration);
    }

    //Inserire variabili che riguarderanno la selezione dei dadi (vedi notion per maggiori dettagli)
    //Inserire funzione che controlli gli input dell'utente (per maggiori dettagli vedi documentaione su notion)
}