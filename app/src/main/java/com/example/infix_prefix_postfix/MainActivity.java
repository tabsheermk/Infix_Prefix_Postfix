package com.example.infix_prefix_postfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText expression = findViewById(R.id.expression);
        Button convert = findViewById(R.id.convert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String expressionTxt = expression.getText().toString();
                if(expressionTxt.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter infix expression", Toast.LENGTH_SHORT).show();
                }
                else{
                    String prefix = Converter.infixToPrefix(expressionTxt.toCharArray());
                    String postfix = Converter.infixToPostfix(expressionTxt);

                    MemoryData.savePrefix(MainActivity.this,prefix);
                    MemoryData.savePostfix(MainActivity.this,postfix);

                    startActivity(new Intent(MainActivity.this, Result.class));
                }
            }
        });
    }
}