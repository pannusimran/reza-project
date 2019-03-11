package com.example.a1794821.rezaproject;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    boolean turnedOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                if(!turnedOn) {
                    imageView.setImageResource(R.drawable.trans);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    turnedOn = true;
                } else
                {imageView.setImageResource(R.drawable.trans_off);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    turnedOn = false;

                }
            }


        });
    }
}
