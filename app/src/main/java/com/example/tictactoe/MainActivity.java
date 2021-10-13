package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    @SuppressLint("SetTextI18n")
    public void play(View view){
        if(count<9){
            Button button = (Button)view;
            if(button.getText().toString().equals("")){
                if (count%2==0){
                    button.setText("X");
                    textView.setText("O's turn");
                } else {
                    button.setText("O");
                    textView.setText("X's turn");

                }
                checkVictory();
                count++;
            }
        }
        if(count>=9&&!checkVictory()) {
            textView.setText("Its a tie!");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clearPressed(View view){
        Button button1 = (Button)findViewById(R.id.tile1);
        button1.setText("");
        Button button2 = (Button)findViewById(R.id.tile2);
        button2.setText("");
        Button button3 = (Button)findViewById(R.id.tile3);
        button3.setText("");
        Button button4 = (Button)findViewById(R.id.tile4);
        button4.setText("");
        Button button5 = (Button)findViewById(R.id.tile5);
        button5.setText("");
        Button button6 = (Button)findViewById(R.id.tile6);
        button6.setText("");
        Button button7 = (Button)findViewById(R.id.tile7);
        button7.setText("");
        Button button8 = (Button)findViewById(R.id.tile8);
        button8.setText("");
        Button button9 = (Button)findViewById(R.id.tile9);
        button9.setText("");
        count=0;
        textView.setText("Start game by clicking a tile!");
    }

    @SuppressLint("SetTextI18n")
    public boolean checkVictory(){
        String tile1 = ((Button)findViewById(R.id.tile1)).getText().toString();
        String tile2 = ((Button)findViewById(R.id.tile2)).getText().toString();
        String tile3 = ((Button)findViewById(R.id.tile3)).getText().toString();
        String tile4 = ((Button)findViewById(R.id.tile4)).getText().toString();
        String tile5 = ((Button)findViewById(R.id.tile5)).getText().toString();
        String tile6 = ((Button)findViewById(R.id.tile6)).getText().toString();
        String tile7 = ((Button)findViewById(R.id.tile7)).getText().toString();
        String tile8 = ((Button)findViewById(R.id.tile8)).getText().toString();
        String tile9 = ((Button)findViewById(R.id.tile9)).getText().toString();

        if(tile1.equals(tile2)&&tile1.equals(tile3)&&!tile1.equals("")){
            textView.setText(tile1 + " wins!");
            return true;
        }
        if(tile1.equals(tile4)&&tile1.equals(tile7)&&!tile1.equals("")){
            textView.setText(tile1 + " wins!");
            return true;
        }
        if(tile1.equals(tile5)&&tile1.equals(tile9)&&!tile1.equals("")){
            textView.setText(tile1 + " wins!");
            return true;
        }
        if(tile2.equals(tile5)&&tile2.equals(tile8)&&!tile2.equals("")){
            textView.setText(tile2 + " wins!");
            return true;
        }
        if(tile3.equals(tile6)&&tile3.equals(tile9)&&!tile3.equals("")){
            textView.setText(tile3 + " wins!");
            return true;
        }
        if(tile3.equals(tile5)&&tile3.equals(tile7)&&!tile3.equals("")){
            textView.setText(tile3 + " wins!");
            return true;
        }
        if(tile4.equals(tile5)&&tile4.equals(tile6)&&!tile4.equals("")){
            textView.setText(tile4 + " wins!");
            return true;
        }
        if(tile7.equals(tile8)&&tile7.equals(tile9)&&!tile7.equals("")){
            textView.setText(tile7 + " wins!");
            return true;
        }
        return false;
    }
}