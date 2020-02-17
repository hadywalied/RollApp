package com.kvectorfoundation.roll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.roll_image);
        roll = findViewById(R.id.button_roll);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = new Random().nextInt(6) + 1;

                switch (x) {
                    case 1:
                        imageView.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.dice_6);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.empty_dice);
                        break;
                }

            }
        });

    }
}
