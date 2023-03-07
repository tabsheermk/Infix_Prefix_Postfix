package com.example.infix_prefix_postfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView prefix = findViewById(R.id.prefix);
        TextView postfix = findViewById(R.id.postfix);
        Button back = findViewById(R.id.back);

        prefix.setText(MemoryData.getPrefix(Result.this));
        postfix.setText(MemoryData.getPostfix(Result.this));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Result.this, MainActivity.class));
            }
        });
    }
}