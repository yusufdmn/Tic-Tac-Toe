package com.example.xoxgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    Button again;
    TextView wonText,turnText;
    ImageView winner,turnImage;
    ImageView one,two,three,four,five,six,seven,eight,nine;
    Boolean turn = true;
    int bOne,btwo,bthree,bfour,bfive,bsix,bseven,beight,bnine;
    int sayac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        turnText=findViewById(R.id.turnTextId);
        turnImage = findViewById(R.id.turnimageId);
        wonText = findViewById(R.id.textView);
        again = findViewById(R.id.playagainId);
        winner = findViewById(R.id.winneId);
        one = findViewById(R.id.imageView);
        two = findViewById(R.id.imageView2);
        three = findViewById(R.id.imageView3);
        four = findViewById(R.id.imageView4);
        five = findViewById(R.id.imageView5);
        six = findViewById(R.id.imageView6);
        seven = findViewById(R.id.imageView7);
        eight = findViewById(R.id.imageView8);
        nine = findViewById(R.id.imageView9);


        winner.setVisibility(View.INVISIBLE);
        wonText.setVisibility(View.INVISIBLE);
        again.setVisibility(View.INVISIBLE);

        if (turn){
            turnImage.setImageResource(R.drawable.circleonly);
        }
        else {
            turnImage.setImageResource(R.drawable.falseonly);
        }
    }

    public void oneF(View view){

        one.setClickable(false);
        if (turn){
            bOne=1;
            turn = false;
            one.setImageResource(R.drawable.circlee);
        }
        else{
            bOne=2;
            turn=true;
            one.setImageResource(R.drawable.falsee);
        }
        win();

    }
    public void twoF(View view){

        two.setClickable(false);
        if (turn){
            btwo=1;
            turn=false;
            two.setImageResource(R.drawable.circlee);
        }
        else{
            btwo=2;
            turn=true;
            two.setImageResource(R.drawable.falsee);
        }
        win();

    }
    public void threeF(View view){

        three.setClickable(false);
        if (turn){
            bthree=1;
            turn=false;
            three.setImageResource(R.drawable.circlee);
        }
        else{
            bthree=2;
            turn=true;
            three.setImageResource(R.drawable.falsee);
        }
        win();

    }
    public void fourF(View view){

        four.setClickable(false);
        if (turn){
            bfour=1;
            turn=false;
            four.setImageResource(R.drawable.circlee);
        }
        else{
            bfour=2;
            turn=true;
            four.setImageResource(R.drawable.falsee);
        }
        win();

    }
    public void fiveF(View view){

        five.setClickable(false);
        if (turn){
            bfive=1;
            turn=false;
            five.setImageResource(R.drawable.circlee);
        }
        else{
            bfive=2;
            turn=true;
            five.setImageResource(R.drawable.falsee);
        }
        win();

    }
    public void sixF(View view){

        six.setClickable(false);
        if (turn){
            bsix=1;
            turn=false;
            six.setImageResource(R.drawable.circlee);
        }
        else{
            bsix=2;
            turn=true;
            six.setImageResource(R.drawable.falsee);
        }
        win();

    }
    public void sevenF(View view){

        seven.setClickable(false);
        if (turn){
            bseven=1;
            turn=false;
            seven.setImageResource(R.drawable.circlee);
        }
        else{
            bseven=2;
            turn=true;
            seven.setImageResource(R.drawable.falsee);
        }
        win();

    }
    public void eightF(View view){

        eight.setClickable(false);
        if (turn){
            beight=1;
            turn=false;
            eight.setImageResource(R.drawable.circlee);
        }
        else{
            beight=2;
            turn=true;
            eight.setImageResource(R.drawable.falsee);
        }
        win();

    }
    public void nineF(View view){

        nine.setClickable(false);
        if (turn){
            bnine=1;
            turn=false;
            nine.setImageResource(R.drawable.circlee);
        }
        else{
            bnine=2;
            turn=true;
            nine.setImageResource(R.drawable.falsee);
        }
        win();
    }



    public void win(){

        sayac++;

        if ((bOne==1 && btwo==1 && bthree==1) || (bOne==1 && bfour==1 && bseven==1) || (bfour==1 && bfive==1 && bsix==1) ||
                (bseven==1 && beight==1 && bnine==1) ||  (btwo==1 && bfive==1 && beight==1) || (bthree==1 && bsix==1 && bnine==1) ||
                (bOne==1 && bfive==1 && bnine==1) || (bthree==1 && bfive==1 && bseven==1)){


            one.setClickable(false);
            two.setClickable(false);
            three.setClickable(false);
            four.setClickable(false);
            five.setClickable(false);
            six.setClickable(false);
            seven.setClickable(false);
            eight.setClickable(false);
            nine.setClickable(false);

            winner.setImageResource(R.drawable.circleonly);
            turnText.setVisibility(View.INVISIBLE);
            turnImage.setVisibility(View.INVISIBLE);
            winner.setVisibility(View.VISIBLE);
            wonText.setVisibility(View.VISIBLE);
            again.setVisibility(View.VISIBLE);

        }
        else if ((bOne==2 && btwo==2 && bthree==2) || (bOne==2 && bfour==2 && bseven==2) || (bfour==2 && bfive==2 && bsix==2) ||
                (bseven==2 && beight==2 && bnine==2) ||  (btwo==2 && bfive==2 && beight==2) || (bthree==2 && bsix==2 && bnine==2) ||
                (bOne==2 && bfive==2 && bnine==2) || (bthree==2 && bfive==2 && bseven==2)){


            one.setClickable(false);
            two.setClickable(false);
            three.setClickable(false);
            four.setClickable(false);
            five.setClickable(false);
            six.setClickable(false);
            seven.setClickable(false);
            eight.setClickable(false);
            nine.setClickable(false);

            winner.setImageResource(R.drawable.falseonly);
            turnText.setVisibility(View.INVISIBLE);
            turnImage.setVisibility(View.INVISIBLE);
            winner.setVisibility(View.VISIBLE);
            wonText.setVisibility(View.VISIBLE);
            again.setVisibility(View.VISIBLE);
        }

        else if (sayac>8){

            wonText.setText("Draw!");
            winner.setImageResource(R.drawable.hands);
            turnText.setVisibility(View.INVISIBLE);
            turnImage.setVisibility(View.INVISIBLE);
            winner.setVisibility(View.VISIBLE);
            wonText.setVisibility(View.VISIBLE);
            again.setVisibility(View.VISIBLE);
        }


        if (turn){
            turnImage.setImageResource(R.drawable.circleonly);
        }
        else {
            turnImage.setImageResource(R.drawable.falseonly);
        }
    }

    public void againF(View view){
        Intent intent = new Intent(GameActivity.this , GameActivity.class);
        startActivity(intent);
        finish();
    }

}
