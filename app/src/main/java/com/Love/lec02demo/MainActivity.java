package com.Love.lec02demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent( MainActivity.this, Recipe.class);
        final Button show_Recipe = findViewById(R.id.button);
        show_Recipe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Log.w("New", "Clicked on view recipe");
                startActivity(intent);
            }
        });

    }
}
