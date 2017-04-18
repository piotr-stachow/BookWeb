package com.ps.bookweb;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ps on 2017-03-06.
 */

public class MainITPSActivity extends ActionBarActivity {

    //wskazanie aktywności żeby korzystała z odpowiedniego layotu, trzeba nadpisać metodę onCreate
    //nadpisanie metody, wywołanie metody rodzica
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //trzeba ustawić widok naszej aktywności i podać nazwę layoutu
        setContentView(R.layout.activity_mainitps);

        /*
        : Adapter element, który łączy ListView z danymi mającymi być prezentowane jako lista
        : intent - czyli zamiar uruchomienia nowej aktywności, tworzymy nowy obiektu klasy Intent
        : zainicjowanie obiektu (new) poprzez wywołanie konstruktora Intent
        : this (czyli nasza klasa) - oznacza z jakiego kontekstu będzie uruchamiana nasza nowa aktywność
        : i uruchamiamy nową aktywność - nazwa aktywności - AboutActivity, parametrem jest intent1

        : przechwytujemy referencję do widoku listowego
        : i tworzymy obiekt listy tablicowej i przypisujemy mu naszą tablicę
        */

        ArrayAdapter adapter;
        ListView listViewLinki = (ListView) findViewById(R.id.listView1_linki);
        String linki[] = {
                getString(R.string.link1),
                getString(R.string.link2),
                getString(R.string.link3),
                getString(R.string.link4)
        };

        /*
        : ArrayList - tworzymy obiekt listy tablicowej i przypisujemy mu naszą tablicę z linkami
        : Arrays.asList() - zwraca listową reprezentację tablicy
         */

        ArrayList linkiArray = new ArrayList();
        linkiArray.addAll( Arrays.asList(linki));
        adapter = new ArrayAdapter(this, R.layout.row_networkconfig, linkiArray);
        listViewLinki.setAdapter(adapter);


    }

    //wygenerowane przez ALT+enter na nazwie metody która ma być
    //wywołana po wciśnięciu przycisku (do stworzenia eventu) z activity_tutorial.xml
    public void OnNextClick(View view) {

        Intent intent1 = new Intent(this, NetworkConfigActivity.class);
        startActivity(intent1);

    }
}
