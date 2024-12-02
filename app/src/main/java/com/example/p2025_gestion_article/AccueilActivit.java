package com.example.p2025_gestion_article;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccueilActivit extends AppCompatActivity{

    private ArrayList<Article> mesArticles;

    private ListView listViewArticles;

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.liste_articles);
        initilialisation();
    }
    private void initilialisation() {
        button2 = (Button) findViewById(R.id.button2);
        listViewArticles = (ListView) findViewById(R.id.listViewArticles);


        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mesArticles.stream().map(h->h.getNom()).collect(Collectors.toList()));
        listViewArticles.setAdapter(adp);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(AccueilActivit.this, CreationArticle.class);
            startActivity(intent);
            }
        });
    }
}
