package com.example.listadeatividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ActivityExercicio3 extends AppCompatActivity {


    String[] cores = {"azul", "vermelho", "preto", "amarelo", "branco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        LinearLayout checkBoxContainer = findViewById(R.id.containerCheckBox);

        List<CheckBox> checkBoxList = new ArrayList<>();
        for (String cor: cores){
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(cor);
            checkBoxContainer.addView(checkBox);
            checkBoxList.add(checkBox);
        }

    }
    public void voltar(View view){
        Intent intent = new Intent(ActivityExercicio3.this, MainActivity.class );
        startActivity(intent);
        finish();
    }

}