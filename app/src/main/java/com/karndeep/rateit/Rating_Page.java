package com.karndeep.rateit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Rating_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating__page);


        RatingBar rating =  (RatingBar)findViewById(R.id.ratingBar);
        final TextView tRate = (TextView) findViewById(R.id.txtRate);

        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float ratingValue, boolean fromUser) {
                tRate.setText("Rating: " + ratingValue);
            }
        });
    }
}
