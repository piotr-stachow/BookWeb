package com.ps.bookweb;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {


    //dodajemy nowe pole w klasie, nazwa obiektu searchEditText
    //searchEditText należy połączyć z widgetem - należy to wykonać w metodzie onCreate
    //ta metoda jest wywoływana kiedy nasza aktywność jest tworzona
    private EditText searchEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //przypisanie widoku
        setContentView(R.layout.activity_search);

        /*
            przypisanie identyfikatora pola EditText
            trzeba wykonać rzutowanie typów ponieważ findViewById zwraca view, a przypisujemy do EditText
            każdy widget dziedziczy po klasie EditText, dlatego można rzutować (cast-ować) do (EditText)
            W ten sposób następuje powiązanie widoku z kodem w javie
        */
        searchEditText = (EditText) findViewById(R.id.searchEditText);

    }


    public void onSearchClick(View view) {

        /*
            mały komunikat
            wyświetlenie tekstu z pola po wciśnięciu przycisku Search
            Toast.makeText - statyczna metoda
            serachEditText.getText - trzeba wywołać pełną metodę na tym obiekcie, ale getText jest typu Editable
            dlatego trzeba wykonać jeszcze jedną metodę toString() żeby wyciągnąć string
            Toast.LENGTH_SHORT - duration czyli czas trwania
            .show() - wyświetlić

        */
        Toast.makeText(this, searchEditText.getText().toString(), Toast.LENGTH_LONG).show();
    }


}
