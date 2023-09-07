package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private TextView textview;
    private TextView textview4;
    private EditText editext;
    private  EditText editext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        textview=findViewById(R.id.textView2);
        editext=findViewById(R.id.editTextNumber);
        editext2=findViewById(R.id.editTextNumber2);
        textview4=findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Addition applied",Toast.LENGTH_SHORT).show();

                String s=editext.getText().toString();
                String s2=editext2.getText().toString();
                int value=Integer.parseInt(s);
                int value2=Integer.parseInt(s2);
                int result=value+value2;
                textview4.setText("Addition Applied");
                button5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(MainActivity.this,"Heyy it worked",Toast.LENGTH_SHORT).show();

                        textview.setText("The result is: "+result);
                    }
                });
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Subtraction applied",Toast.LENGTH_SHORT).show();

                String s=editext.getText().toString();
                String s2=editext2.getText().toString();
                int value=Integer.parseInt(s);
                int value2=Integer.parseInt(s2);
                int result=value-value2;
                textview4.setText("Subtraction Applied");
                button5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(MainActivity.this,"Heyy it worked",Toast.LENGTH_SHORT).show();

                        textview.setText("The result is: "+result);
                    }
                });

            }


        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Multiplication applied",Toast.LENGTH_SHORT).show();

                String s=editext.getText().toString();
                String s2=editext2.getText().toString();
                int value=Integer.parseInt(s);
                int value2=Integer.parseInt(s2);
                int result=value*value2;
                textview4.setText("Multiplication Applied");
                button5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(MainActivity.this,"Heyy it worked",Toast.LENGTH_SHORT).show();

                        textview.setText("The result is: "+result);
                    }
                });
            }


        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Division applied",Toast.LENGTH_SHORT).show();

                String s=editext.getText().toString();
                String s2=editext2.getText().toString();
                float value=Float.parseFloat(s);
                float value2=Float.parseFloat(s2);
                float result=value/value2;
                textview4.setText("Division Applied");
                button5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        //Toast.makeText(MainActivity.this,"Heyy it worked",Toast.LENGTH_SHORT).show();

                        textview.setText("The result is: "+result);
                    }
                });
            }


        });

    }
}