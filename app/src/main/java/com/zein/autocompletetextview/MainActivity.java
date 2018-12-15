package com.zein.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] texts = {
            "Sharan Debonis",
            "Idell Corrie",
            "Bryon Rodd",
            "Karolyn Niemeyer",
            "Heike Trieu",
            "Cordell Millikin",
            "Belle Wenz",
            "Sheena Roberto",
            "Xochitl Sandusky",
            "Helen Aho",
            "Danae Valero",
            "Valencia Winkfield",
            "Roxanna Gelb",
            "Everett Mendoza",
            "Jeffery Seltzer",
            "Aide Keen",
            "Remedios Hickel",
            "Emma Veazey",
            "Angelyn Aaron",
            "Mayra Ronk"
    };

    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter =  new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,texts);

        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);

    }
}
