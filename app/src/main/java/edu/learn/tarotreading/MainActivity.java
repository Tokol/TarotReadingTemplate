package edu.learn.tarotreading;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.optionGrid);
        String options[] ={"General Reading", "Career", "Education", "Health","Relationship", "Yes/No Quest"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.grid_item, R.id.text, options);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        int value = 0;
                if(position==0){
                    value =7;
                }

                else if(position==5){
                    value =3;
                }

                else {
                    value =5;
                }
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("value", value);
                startActivity(intent);
            }
        });

    }
}