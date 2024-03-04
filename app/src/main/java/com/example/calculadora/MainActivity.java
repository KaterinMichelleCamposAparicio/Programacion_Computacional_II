package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblnum1, textView;
    private Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero, btnComa, btnPunto, btnIgual, btnSuma, btnResta, btnMultiplicacion, btnDivicion, btnExpo, btnPorcentaje, btnFactorial, btnRaiz;
    private double num1, num2, resultado;

    private int numfact;
    private String operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlazar variables con objetos del layout
        lblnum1 = findViewById(R.id.lblnum1);
        textView = findViewById(R.id.textView);
        btnCero = findViewById(R.id.btnCero);
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve = findViewById(R.id.btnNueve);
        btnCero = findViewById(R.id.btnCero);
        btnPunto = findViewById(R.id.btnPunto);
        btnComa = findViewById(R.id.btnComa);
        btnIgual = findViewById(R.id.btnIgual);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivicion = findViewById(R.id.btnDivicion);
        btnExpo = findViewById(R.id.btnExpo);
        Button btnClear = findViewById(R.id.btnClear);
        btnFactorial = findViewById(R.id.btnFactorial);
        btnPorcentaje = findViewById(R.id.btnPorcentaje);
        btnRaiz = findViewById(R.id.btnRaiz);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblnum1.setText("");
                textView.setText("");
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("0");
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("1");
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("3");
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("6");
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("7");
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("8");
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado("9");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado(".");
            }
        });
        btnComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroPulsado(",");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (operador) {
                    case "+":
                        num2 = Double.parseDouble(lblnum1.getText().toString());
                        resultado = num1 + num2;
                        break;
                    case "-":
                        num2 = Double.parseDouble(lblnum1.getText().toString());
                        resultado = num1 - num2;
                        break;
                    case "*":
                        num2 = Double.parseDouble(lblnum1.getText().toString());
                        resultado = num1 * num2;
                        break;
                    case "^":
                        num2 = Double.parseDouble(lblnum1.getText().toString());
                        resultado = Math.pow(num1, num2);
                        break;
                    case "!":
                        numfact = Integer.parseInt(lblnum1.getText().toString());
                        resultado = Factorial(numfact);
                        lblnum1.setText("");
                        break;
                    case "√":
                        num1 = Double.parseDouble(lblnum1.getText().toString());
                        resultado = Math.sqrt(num1);
                        lblnum1.setText("");
                        break;
                    case "/":
                        num2 = Double.parseDouble(lblnum1.getText().toString());
                        if (num2 == 0) {
                            textView.setText("Error: División por 0");
                        } else {
                            resultado = num1 / num2;
                        }
                        break;
                }

                textView.setText(String.format("%.2f", resultado));
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "+";
                num1 = Double.parseDouble(lblnum1.getText().toString());
                lblnum1.setText("");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "-";
                num1 = Double.parseDouble(lblnum1.getText().toString());
                lblnum1.setText("");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "*";
                num1 = Double.parseDouble(lblnum1.getText().toString());
                lblnum1.setText("");
            }
        });
        btnDivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "/";
                num1 = Double.parseDouble(lblnum1.getText().toString());
                lblnum1.setText("");
            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "!";
            }
        });

        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.parseDouble(lblnum1.getText().toString());
                resultado = num1 * num2 / 100;
                textView.setText(String.format("%.2f", resultado));
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "√";
            }
        });

        btnExpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "^";
                num1 = Double.parseDouble(lblnum1.getText().toString());
                lblnum1.setText("");
            }
        });
    }

    private int Factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }

    private void numeroPulsado(String numero) {
        lblnum1.setText(lblnum1.getText().toString() + numero);
    }
}
