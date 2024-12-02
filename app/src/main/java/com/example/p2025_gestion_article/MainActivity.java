package com.example.p2025_gestion_article;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText mdp;
    private Button button;
    private TextView idrep;
    private String log, mot;

    private ArrayList<User> LesUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initUser();
        initilialisation();


    }



    private void initUser(){
        LesUsers = new ArrayList<User>();
        LesUsers.add(new User("jules", "root"));
        LesUsers.add(new User("yann", "root"));
    }

    private void initilialisation() {
            button = (Button) findViewById(R.id.button);
            login = (EditText) findViewById(R.id.login);
            mdp = (EditText) findViewById(R.id.mdp);
            idrep = (TextView) findViewById(R.id.idrep);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mot = mdp.getText().toString();
                log = login.getText().toString();
                if(controle(log, mot)) {
                    idrep.setText("connection ok");
                    Intent intent = new Intent(MainActivity.this, AccueilActivit.class);
                    startActivity(intent);
                }else{
                    idrep.setText("connection KO");
                }
            }
        });

    }

    private boolean controle(String login, String mdp){
        boolean rep = false;
        for(User users: LesUsers){
            if(users.getLogin().equals(login) && users.getPassword().equals(mdp)){
                rep = true;
            }
        }
        return rep;
    }
}