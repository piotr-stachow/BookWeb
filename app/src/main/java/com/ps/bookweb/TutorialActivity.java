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

    //wskazanie aktywności żeby korzystała z odpowiedniego layotu
    //trzeba nadpisać metodę onCreate

    //nadpisanie metody, wywołanie metody rodzica
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    //trzeba ustawić widok naszej aktywności i podać nazwę layoutu
        setContentView(R.layout.activity_tutorial);
    }

    //wygenerowane przez ALT+enter(do stworzenia eventu) z activity_tutorial.xml na nazwie metody która ma być
    //wywołana po wciśnięciu przycisku
    public void OnNextClick(View view) {

        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);

    }
}
