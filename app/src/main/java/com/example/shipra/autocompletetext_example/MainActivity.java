package com.example.shipra.autocompletetext_example;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] languages = {"c", "c++", ".Net", "python", "kotlin", "java", "php"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, languages);

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.auto_complete_text_view);
        actv.setThreshold(1);  //will start working from the first character
        actv.setAdapter(adapter); //set the adapter data in to the auto complete text view

        actv.setTextColor(Color.RED);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}