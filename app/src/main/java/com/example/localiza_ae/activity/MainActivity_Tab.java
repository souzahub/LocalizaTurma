package com.example.localiza_ae.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.localiza_ae.R;
import com.example.localiza_ae.fragment.AlunoFragment;
import com.example.localiza_ae.fragment.ProfFragment;

public class MainActivity_Tab extends AppCompatActivity {

    private Button buttonAlunos, buttonProf ;
    private AlunoFragment alunoFragment;
    private ProfFragment profFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__tab);

        buttonAlunos = findViewById(R.id.buttonAlunos);
        buttonProf = findViewById(R.id.buttonProf);

        //Remover sombra da Action
       // getSupportActionBar().setElevation(0);

        alunoFragment = new AlunoFragment();

        //Configurar objeto para Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, alunoFragment );
        transaction.commit();

        buttonAlunos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alunoFragment = new AlunoFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, alunoFragment );
                transaction.commit();


            }
        });

        buttonProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                profFragment = new ProfFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, profFragment );
                transaction.commit();
                startActivities(new Intent[]{new Intent(getApplicationContext(), MainActivity.class)}); // abre a Tela Principal  "MainActivity"


            }
        });


    }
}