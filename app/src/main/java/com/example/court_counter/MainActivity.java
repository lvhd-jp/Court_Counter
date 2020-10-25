package com.example.court_counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score1 = 0;
    int score2 = 0;
    private TextView mScoreText1;
    private TextView mScoreText2;
    private Menu menu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreText1 = findViewById(R.id.score1);
        mScoreText2 = findViewById(R.id.score2);
        mScoreText1.setText(String.valueOf(score1));
        mScoreText2.setText(String.valueOf(score2));
        menu1 = findViewById(R.id.action_settings);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                displayToast("You choose Setting");
                return true;
            case R.id.team1:
                displayToast("You choose About Team 1");
                return true;
            case R.id.team2:
                displayToast("You choose About Team 2");
                return true;
            default:
                // Do nothing
        }
        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void Reset(View view) {
        score1 = 0;
        score2 = 0;
        mScoreText1.setText(String.valueOf(score1));
        mScoreText2.setText(String.valueOf(score2));
        displayToast("You choose Reset");
    }

    public void increase3points(View view) {
        // Get the ID of the button that was clicked.
        int viewID = view.getId();
        switch (viewID) {
            // If it was on Team 1:
            case R.id.team1_3points:
                // Increment the score and update the TextView.
                score1 = score1 + 3;
                mScoreText1.setText(String.valueOf(score1));
                break;
            // If it was Team 2:
            case R.id.team2_3points:
                // Increment the score and update the TextView.
                score2 = score2 + 3;
                mScoreText2.setText(String.valueOf(score2));
        }
    }

    public void increase2points(View view) {
        // Get the ID of the button that was clicked.
        int viewID = view.getId();
        switch (viewID) {
            // If it was on Team 1:
            case R.id.team1_2points:
                // Increment the score and update the TextView.
                score1 = score1 + 2;
                mScoreText1.setText(String.valueOf(score1));
                break;
            // If it was Team 2:
            case R.id.team2_2points:
                // Increment the score and update the TextView.
                score2 = score2 + 2;
                mScoreText2.setText(String.valueOf(score2));
        }
    }

    public void increase1points(View view) {
        int viewID = view.getId();
        if (viewID == R.id.team1_free_throw) {
            score1 = score1 + 1;
            mScoreText1.setText(String.valueOf(score1));
        }
        if (viewID == R.id.team2_free_throw) {
            score2 = score2 + 1;
            mScoreText2.setText(String.valueOf(score2));
        }
    }

}