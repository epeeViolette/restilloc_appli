package com.example.restilloc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //redirection vers la page principale "MainActivity" après 3 secondes.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
               //démarer une page avec le context de l'activité actuelle et la page sur laquelle se rediriger
                Intent intent = new Intent(getApplicationContext(), ActivityLogin.class);
                //pour commencer l'activité
                startActivity(intent);
                //Pour finir l'activité
                finish();
            }
        };

        //Handler delayed qui va porter la liste d'instruction avec uun delais
        new Handler().postDelayed(runnable,3000);
    }
}