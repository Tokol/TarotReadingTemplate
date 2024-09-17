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

            // associate gridview here from layout

        // gridOptions are

        /*
         * 0: General Reading
         * 1: Career
         * 2: Education
         * 3: Health
         * 4: Relationship
         * 5: Yes/No Quest
         */


     // while setting adapter use R.layout.grid_item and for text use R.id.text



        // set GridView item onClick listener



    }
}