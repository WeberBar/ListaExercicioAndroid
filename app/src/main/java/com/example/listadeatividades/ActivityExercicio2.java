package com.example.listadeatividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityExercicio2 extends AppCompatActivity {

    Button botaoSoma, botaoSubtracao, botaoMultiplicacao, botaoDivisao, botaoLimpar;
    TextView operador, valor1, valor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        operador = findViewById(R.id.operador);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);


        botaoSoma = findViewById(R.id.botaoSoma);
        botaoSubtracao = findViewById(R.id.botaoSubtracao);
        botaoMultiplicacao = findViewById(R.id.botaoMultiplicacao);
        botaoDivisao = findViewById(R.id.botaoDivisao);
        botaoLimpar = findViewById(R.id.limpar);


        botaoSoma.setOnClickListener(v -> calcular("+"));
        botaoSubtracao.setOnClickListener(v -> calcular("-"));
        botaoDivisao.setOnClickListener(v -> calcular("/"));
        botaoMultiplicacao.setOnClickListener(v -> calcular("x"));
        botaoLimpar.setOnClickListener(v -> limparDigitos());

    }

    public void calcular(String operadorEscolhido) {

        Integer numeroUmConvert = 0;
        Integer numeroDoisConvert = 0;
        try {
            numeroUmConvert = Integer.parseInt(valor1.getText().toString());
            numeroDoisConvert = Integer.parseInt(valor2.getText().toString());

            switch (operadorEscolhido) {
                case "+":
                    Toast.makeText(this, "O Resultado é: " + (numeroUmConvert + numeroDoisConvert), Toast.LENGTH_LONG).show();
                    operador.setText("+");
                    break;
                case "-":
                    Toast.makeText(this, "O Resultado é: " + (numeroUmConvert - numeroDoisConvert), Toast.LENGTH_LONG).show();
                    operador.setText("-");
                    break;
                case "/":
                    Toast.makeText(this, "O Resultado é:" + (numeroUmConvert / numeroDoisConvert), Toast.LENGTH_LONG).show();
                    operador.setText("/");
                    break;
                case "x":
                    Toast.makeText(this, "O Resultado é:" + (numeroUmConvert * numeroDoisConvert), Toast.LENGTH_LONG).show();
                    operador.setText("/");
                    break;

            }
        } catch (NumberFormatException ex) {
            Toast.makeText(this, "Preencha os números", Toast.LENGTH_LONG).show();

        }

    }

    public void limparDigitos(){
        valor1.setText("");
        valor2.setText("");
    }

    public void irHome(View view){
        Intent intent = new Intent(ActivityExercicio2.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}





