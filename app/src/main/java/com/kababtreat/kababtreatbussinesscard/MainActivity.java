package com.kababtreat.kababtreatbussinesscard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int shareButtonClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View.OnClickListener ourListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shareButtonClicked > 0)
                    Toast.makeText(MainActivity.this, "You have already clicked to share.Please wait!!", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Your card will be shared shortly", Toast.LENGTH_SHORT).show();
                shareButtonClicked++;
            }
        };
        Button shareButton = (Button) findViewById(R.id.button);
        shareButton.setOnClickListener(ourListener);



    }


}
