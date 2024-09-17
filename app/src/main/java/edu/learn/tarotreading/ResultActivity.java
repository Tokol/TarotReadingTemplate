package edu.learn.tarotreading;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    ImageView imageView0, imageView1,
            imageView2, imageView3, imageView4,
            imageView5, imageView6, imageView7, imageView8;

    ArrayList<Integer> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);
        imageView0 = findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageView4 = findViewById(R.id.imageView5);
        imageView5 = findViewById(R.id.imageView6);
        imageView6 = findViewById(R.id.imageView7);
        imageView7 = findViewById(R.id.imageView8);
        imageView8 = findViewById(R.id.imageView9);


        Intent intent = getIntent();

        int value = intent.getIntExtra("value", 0);


        Log.d("Values",value+"");
        fillArray(value);


        if(value==7){
            int resource0 = getResources().getIdentifier("tarot"+numbers.get(0), "drawable", getPackageName());
            imageView0.setImageResource(resource0);


            int resource1 = getResources().getIdentifier("tarot"+numbers.get(1), "drawable", getPackageName());
            imageView1.setImageResource(resource1);

            int resource2 = getResources().getIdentifier("tarot"+numbers.get(2), "drawable", getPackageName());
            imageView2.setImageResource(resource2);


            int resource3 = getResources().getIdentifier("tarot"+numbers.get(3), "drawable", getPackageName());
            imageView3.setImageResource(resource3);


            int resource4 = getResources().getIdentifier("tarot"+numbers.get(4), "drawable", getPackageName());
            imageView4.setImageResource(resource4);


            int resource5 = getResources().getIdentifier("tarot"+numbers.get(5), "drawable", getPackageName());
            imageView5.setImageResource(resource5);


            int resource6 = getResources().getIdentifier("tarot"+numbers.get(6), "drawable", getPackageName());
            imageView6.setImageResource(resource6);



        }

        if(value==5){
            int resource0 = getResources().getIdentifier("tarot"+numbers.get(0), "drawable", getPackageName());
            imageView0.setImageResource(resource0);


            int resource1 = getResources().getIdentifier("tarot"+numbers.get(1), "drawable", getPackageName());
            imageView1.setImageResource(resource1);

            int resource2 = getResources().getIdentifier("tarot"+numbers.get(2), "drawable", getPackageName());
            imageView2.setImageResource(resource2);


            int resource3 = getResources().getIdentifier("tarot"+numbers.get(3), "drawable", getPackageName());
            imageView3.setImageResource(resource3);


            int resource4 = getResources().getIdentifier("tarot"+numbers.get(4), "drawable", getPackageName());
            imageView4.setImageResource(resource4);




        }


        if(value==3){
            int resource0 = getResources().getIdentifier("tarot"+numbers.get(0), "drawable", getPackageName());
            imageView0.setImageResource(resource0);


            int resource1 = getResources().getIdentifier("tarot"+numbers.get(1), "drawable", getPackageName());
            imageView1.setImageResource(resource1);

            int resource2 = getResources().getIdentifier("tarot"+numbers.get(2), "drawable", getPackageName());
            imageView2.setImageResource(resource2);




        }




    }

    int generateRandom(){
        Random random = new Random();
        return random.nextInt(78);
    }



   void fillArray(int num){
        int count =0;

        while(count<num){
            int getNum = generateRandom();

            if(!numbers.contains(getNum)){
                numbers.add(getNum);
                count++;
            }
        }
        Log.d("Numbers",numbers.toString());
    }


}