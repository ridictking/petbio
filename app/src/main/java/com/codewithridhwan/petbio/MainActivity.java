package com.codewithridhwan.petbio;

 import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView cat;
    private ImageView dog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = findViewById(R.id.catImg);
        dog = findViewById(R.id.dogImg);

         cat.setOnClickListener(this);
         dog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, PetDetails.class);
        int i = v.getId();
        switch (i){
            case R.id.catImg:
                intent.putExtra("name","Jarvis");
                intent.putExtra("bio", "Great cat, Loves people and meows a lot");
                intent.putExtra("img",R.drawable.cat);
                //Toast.makeText(MainActivity.this,"Cat touched", Toast.LENGTH_LONG).show();
                break;
            case R.id.dogImg:
                intent.putExtra("name","Dufus");
                intent.putExtra("bio", "Great dog, Loves people and barks and eats a lot");
                intent.putExtra("img",R.drawable.dogicon);
                //Toast.makeText(MainActivity.this,"Dog touched", Toast.LENGTH_LONG).show();
                break;
        }
        startActivity(intent);
    }
}