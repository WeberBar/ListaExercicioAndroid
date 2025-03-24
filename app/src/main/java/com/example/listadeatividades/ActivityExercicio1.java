package com.example.listadeatividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityExercicio1 extends AppCompatActivity {

    EditText nome, idade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void verificarIdade(View view){
        nome = findViewById(R.id.nome);
        idade = findViewById(R.id.idade);

        if(nome.getText().length() == 0 || idade.length() == 0){
            Toast.makeText(this,"Falta algum campo ser preenchido",Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(this,nome.getText() + " é " + (Integer.parseInt(idade.getText().toString()) >= 18 ? "maior de idade" : "menor de idade" ),Toast.LENGTH_LONG).show();
        }
    }

    public void voltar(View view){
        Intent intent = new Intent(ActivityExercicio1.this, MainActivity.class );
        startActivity(intent);
        finish();
    }
}