package com.kaplan.pdma.fromheretothere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageView car3 = (ImageView) findViewById(R.id.imageViewCar3);
        car3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        car3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                finish(); //go back to first screen
                return true;
            }
        });
    }
}
