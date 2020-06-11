package com.example.localiza_ae.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.localiza_ae.R;

public class MainActivity extends AppCompatActivity {
    public static TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Chamada da segunda Active
        // Chamada da segunda Active
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.txRecebeValor);
        button=(Button)findViewById(R.id.buttonAlunos);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
