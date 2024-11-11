package com.example.myapplication;
 import android.graphics.Typeface; import android.os.Bundle; import android.widget.Button; import android.widget.TextView; import android.widget.Toast; import androidx.appcompat.app.AppCompatActivity; public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Button changeTextButton = findViewById(R.id.changeTextButton);
        changeTextButton.setOnClickListener(view -> {
            textView.setTextSize(32);
            textView.setTypeface(Typeface.SERIF, Typeface.ITALIC); textView.setText("Welcome to android studio!!");
            Toast.makeText(MainActivity.this, "!!Font and size Changed!!",
                    Toast.LENGTH_SHORT).show();
        });
    } }
