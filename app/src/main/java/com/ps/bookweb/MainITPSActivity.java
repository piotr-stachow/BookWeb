package com.ps.bookweb;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
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
    private String[] linki;
    private ListView listView_linki;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainitps);
        /*
        : wskazanie aktywności żeby korzystała z odpowiedniego layotu, trzeba nadpisać metodę onCreate
        : nadpisanie metody, wywołanie metody rodzica
        : trzeba ustawić widok naszej aktywności i podać nazwę layoutu
        */

        //przechwytujemy referencję do widoku listowego
        listView_linki = (ListView) findViewById(R.id.listView_linki);
        initPobierzLinki();
        initListViewLinki();

        /*
        inny sposób
        String linki[] = {
                getString(R.string.link1),
                getString(R.string.link2),
                getString(R.string.link3),
                getString(R.string.link4)
        };

        : ArrayList - tworzymy obiekt listy tablicowej i przypisujemy mu naszą tablicę z linkami
        : Arrays.asList() - zwraca listową reprezentację tablicy

        ArrayList linkiArray = new ArrayList();
        linkiArray.addAll(Arrays.asList(linki));
        adapter = new ArrayAdapter(this, R.layout.element_listview, linkiArray);
        listViewLinki.setAdapter(adapter);
        */
    }

    public void initPobierzLinki(){
        /*
        : POBIERANIE DANYCH z /res/values/strings.xml
        : odbywa się to poprzez obiekt Resources, który wewnątrz klasy Aktywności można pobrać
        : za pomocą getResources(). Metoda ta zawraca obiekt dający nam dostęp do wszystkich zasobów
        : folderu /res/ naszej aplikacji.

        : Elementy zasobów naszej aplikacji pobieramy za pomocą metod get…(int). Zwracają one element,
        : na którego ID wskazują pola statyczne automatycznie generowanej klasy R. My korzystamy
        : z metody getStringArray(int)
        */

        Resources dane = getResources();
        linki = dane.getStringArray(R.array.lista_linkow);
    }


    private void initListViewLinki(){
        /*
        : INICJALIZACJA LISTVIEW
        : Adapter element, który łączy ListView z danymi mającymi być prezentowane jako lista
        : wzorzec Adapter, powinien dziedziczyć z klasy BaseAdapter. Android domyślnie posiada dwie
        : implementacje adapterów – CursorAdapter oraz ArrayAdapter - który służy do „adaptowania” danych będących tablicami
        : (CursorAdapter służy do obsługi danych bazodanowych
        : Żeby element ListView wyświetlił przekazane mu dane musimy skorzystać z wzorca Adapter,
        : Konstruktorowi, oprócz kontekstu aplikacji przekazujemy:
        : - layout pojedynczego elementu listy (android.R.layout jest polem,
        : w którym przechowywane są domyślne layouty, dostarczone wraz z systemem Android),
        : - tablicę napisów, którą wcześniej pobraliśmy z zasobów naszej aplikacji.
        */
        adapter = new ArrayAdapter(getApplicationContext(), R.layout.element_listview, linki);
        listView_linki.setAdapter(adapter);
    }


    //wygenerowane przez ALT+enter na nazwie metody która ma być
    //wywołana po wciśnięciu przycisku (do stworzenia eventu) z activity_tutorial.xml
    public void OnNextClick(View view) {
        /*
        : intent - czyli zamiar uruchomienia nowej aktywności, tworzymy nowy obiektu klasy Intent
        : zainicjowanie obiektu (new) poprzez wywołanie konstruktora Intent
        : this (czyli nasza klasa) - oznacza z jakiego kontekstu będzie uruchamiana nasza nowa aktywność
        : i uruchamiamy nową aktywność - nazwa aktywności
        */

        Intent intent1 = new Intent(this, NetworkConfigActivity.class);
        startActivity(intent1);
    }
}
