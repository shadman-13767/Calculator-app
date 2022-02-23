package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText fv,sv;
    Button add,minus,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fv=findViewById(R.id.editTextNumber);
        sv=findViewById(R.id.editTextNumber2);
        tv=findViewById(R.id.textView2);
        add=findViewById(R.id.add);
        minus=findViewById(R.id.minus);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,ans;

                a=Integer.parseInt(fv.getText().toString());
                b=Integer.parseInt(sv.getText().toString());

                ans=a+b;

                tv.setText("Ans: "+ans);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,ans;

                a=Integer.parseInt(fv.getText().toString());
                b=Integer.parseInt(sv.getText().toString());

                ans=a-b;

                tv.setText("Ans: "+ans);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,ans;

                a=Integer.parseInt(fv.getText().toString());
                b=Integer.parseInt(sv.getText().toString());

                ans=a*b;

                tv.setText("Ans: "+ans);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,ans;

                a=Integer.parseInt(fv.getText().toString());
                b=Integer.parseInt(sv.getText().toString());

                ans=a/b;

                tv.setText("Ans: "+ans);
            }
        });

    }
}