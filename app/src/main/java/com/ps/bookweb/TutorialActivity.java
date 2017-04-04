package com.ps.bookweb;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.ps.bookweb.R;

/**
 * Created by ps on 2017-03-06.
 */

public class TutorialActivity extends ActionBarActivity {

    //wskazanie aktywności żeby korzystała z odpowiedniego layotu, trzeba nadpisać metodę onCreate
    //nadpisanie metody, wywołanie metody rodzica
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    //trzeba ustawić widok naszej aktywności i podać nazwę layoutu
        setContentView(R.layout.activity_tutorial);
    }

    //wygenerowane przez ALT+enter na nazwie metody która ma być
    //wywołana po wciśnięciu przycisku (do stworzenia eventu) z activity_tutorial.xml
    public void OnNextClick(View view) {

        //intent - czyli zamiar uruchomienia nowej aktywności, tworzymy nowy obiektu klasy Intent
        // zainicjowanie obiektu (new) poprzez wywołanie konstruktora Intent
        //this (czyli nasza klasa) - oznacza z jakiego kontekstu będzie uruchamiana nasza nowa aktywność
        // i uruchamiamy nową aktywność - nazawa aktywności - AboutActivity, parametrem jest intent1

        Intent intent1 = new Intent(this, HomeActivity.class);
        startActivity(intent1);

    }
}
