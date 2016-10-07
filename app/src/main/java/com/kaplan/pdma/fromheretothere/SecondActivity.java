package com.kaplan.pdma.fromheretothere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView car2 = (ImageView) findViewById(R.id.imageViewCar2);
        car2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); //terminate this screen/activity
            }
        });
    }
}
