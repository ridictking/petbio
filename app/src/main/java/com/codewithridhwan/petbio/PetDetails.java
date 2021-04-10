package com.codewithridhwan.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PetDetails extends AppCompatActivity {

    private TextView name;
    private TextView bio;
    private ImageView pix;;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details2);

        extras = getIntent().getExtras();



        name = findViewById(R.id.name);
        bio = findViewById(R.id.age);
        pix = findViewById(R.id.displayImageView);
        if(extras != null) {
            int petImg = (extras.getInt("img"));
            setUp(extras.getString("name"), extras.getString("bio"), petImg);
        }

    }
    public void setUp(String name, String bio, int petImg){
        this.name.setText(name);
        this.bio.setText(bio);
        this.pix.setImageDrawable(getResources().getDrawable(petImg));
    }
}