package com.example.working_with_java_lab5;

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

   /*Toast demo from lab
    public  void onToast(View v){
        Toast T = Toast.makeText(this,"You just Toasted Button",Toast.LENGTH_SHORT);
        T.setGravity(50,100,-300);
        T.show();
    }*/

        Button rollButton = (Button) findViewById(R.id.rollbutton);
        final ImageView leftDice = (ImageView) findViewById(R.id.imageView_Leftdice);
        final ImageView rightDice = (ImageView) findViewById(R.id.imageView_Rightdice);
        final int[] diceArray = {
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("1", "Button has been Pressed ");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dice", "" + number);
                leftDice.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }
        });

    }
}
