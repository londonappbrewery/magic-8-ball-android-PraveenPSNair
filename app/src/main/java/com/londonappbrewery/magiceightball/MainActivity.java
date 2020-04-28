package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Developed by P S",Toast.LENGTH_SHORT).show();
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        final Button askButton = (Button) (findViewById(R.id.ask_Button));
        final int[] ballArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Log.d("Eight Ball","askButton is Pressed");

               Random randomNumberGenerator= new Random();
               int number=randomNumberGenerator.nextInt(5);
               Log.d("Generated Number","is"+number) ;
               ballDisplay.setImageResource(ballArray[number]);
            }
        });





    }
}
