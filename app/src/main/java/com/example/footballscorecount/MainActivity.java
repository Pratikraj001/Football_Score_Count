package com.example.footballscorecount;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public void displayForTeamA(int score) {
//        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
//        scoreView.setText(String.valueOf(score));
//    }

    int team_A_score = 0 , team_B_score;


    public void team_a_3_score (View view) {
        team_A_score = (team_A_score + 3);
        display_team_a (team_A_score);
    }
    public void team_a_2_score (View view) {
        team_A_score = (team_A_score + 2);
        display_team_a (team_A_score);
    }
    public void team_a_1_score( View view){
        team_A_score = (team_A_score+1);
        display_team_a(team_A_score);
    }




    public void team_b_3_score (View view) {
        team_B_score = (team_B_score + 3);
        display_team_b (team_B_score);
    }
    public void team_b_2_score (View view) {
        team_B_score = (team_B_score + 2);
        display_team_b (team_B_score);
    }
    public void team_b_1_score( View view){
        team_B_score = (team_B_score+1);
        display_team_b (team_B_score);
    }
    public void reset(View view){
        team_A_score = 0;
        team_B_score = 0;
        display_team_a(team_A_score);
        display_team_b(team_B_score);
    }
    private void display_team_a(int score) {
        TextView scoreTextView =  findViewById(R.id.a_score);
        scoreTextView.setText(String.valueOf(score));
    }
    private void display_team_b(int score) {
        TextView scoreTextView = findViewById(R.id.b_score);
        scoreTextView.setText(String.valueOf(score));
    }

}