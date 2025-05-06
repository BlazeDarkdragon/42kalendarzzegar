package com.example.a42kalendarzzegar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    public void intencja1(View view) {
        Intent intencja1 = new Intent(this, Styl1.class);
        startActivity(intencja1);
    }
    public void intencja2(View view) {
        Intent intencja2 = new Intent(this, Styl2.class);
        startActivity(intencja2);
    }
    public void intencja3(View view) {
        Intent intencja3 = new Intent(this, Styl3.class);
        startActivity(intencja3);
    }
    public void intencja4(View view) {
        Intent intencja4 = new Intent(this, Styl4.class);
        startActivity(intencja4);
    }
}