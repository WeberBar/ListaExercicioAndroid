package com.example.listadeatividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void irExercicio1(View view){
        intent = new Intent(MainActivity.this, ActivityExercicio1.class);
        startActivity(intent);
        finish();
    }

    public void irExercicio2(View view){
        intent = new Intent(MainActivity.this, ActivityExercicio2.class);
        startActivity(intent);
        finish();
    }
    public void irExercicio3(View view){
        intent = new Intent(MainActivity.this, ActivityExercicio3.class);
        startActivity(intent);
        finish();
    }
    public void irExercicio4(View view){
        intent = new Intent(MainActivity.this, ActivityExercicio4.class);
        startActivity(intent);
        finish();
    }
}