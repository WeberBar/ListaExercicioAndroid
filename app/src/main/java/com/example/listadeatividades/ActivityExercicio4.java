package com.example.listadeatividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ActivityExercicio4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        LinearLayout  checkBoxContainer =  findViewById(R.id.containerCheckBox);
        Button gerarCheckBox = findViewById(R.id.gerar);

        EditText nome = findViewById(R.id.nomeUsuario);

        gerarCheckBox.setOnClickListener(v -> {

            char[] nomeSeparado = nome.getText().toString().toCharArray();
            for (char letra: nomeSeparado){
                CheckBox checkBox = new CheckBox(this);
                checkBox.setText(String.valueOf(letra));
                checkBoxContainer.addView(checkBox);

            }

        });

    }
    public void voltar(View view){
        Intent intent = new Intent(ActivityExercicio4.this, MainActivity.class );
        startActivity(intent);
        finish();
    }
}