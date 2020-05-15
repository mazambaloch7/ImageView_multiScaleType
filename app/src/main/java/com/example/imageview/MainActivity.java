package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView imageView;
    Button center, centerCrop, fitEnd, matrix, centerInside, fitStart, fitCenter, fitXY;
    TextView display_scaletype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        center = (Button) findViewById(R.id.center);
        centerCrop = (Button) findViewById(R.id.centerCrop);
        fitEnd = (Button) findViewById(R.id.fitEnd);
        matrix = (Button) findViewById(R.id.matrix);
        centerInside = (Button) findViewById(R.id.centerInside);
        fitStart = (Button) findViewById(R.id.fitStart);
        fitCenter = (Button) findViewById(R.id.fitCenter);
        fitXY = (Button) findViewById(R.id.fitXY);
        imageView = (ImageView) findViewById(R.id.image1);
        display_scaletype = (TextView) findViewById(R.id.display_scaletype);

        //click listener
        center.setOnClickListener(this);
        centerCrop.setOnClickListener(this);
        fitEnd.setOnClickListener(this);
        matrix.setOnClickListener(this);
        centerInside.setOnClickListener(this);
        fitStart.setOnClickListener(this);
        fitCenter.setOnClickListener(this);
        fitXY.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.center)
        {
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            display_scaletype.setText("ScaleType is CENTER");
        }
        else if (v.getId() == R.id.centerCrop) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            display_scaletype.setText("ScaleType is CENTER_CROP");
        } else if (v.getId() == R.id.fitEnd) {
            imageView.setScaleType(ImageView.ScaleType.FIT_END);
            display_scaletype.setText("ScaleType is FIT_END");
        } else if (v.getId() == R.id.matrix) {
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
            display_scaletype.setText("ScaleType is MATRIX");
        } else if (v.getId() == R.id.centerInside) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            display_scaletype.setText("ScaleType is CENTER_INSIDE");
        } else if (v.getId() == R.id.fitStart) {
            imageView.setScaleType(ImageView.ScaleType.FIT_START);
            display_scaletype.setText("ScaleType is FIT_START");
        } else if (v.getId() == R.id.fitCenter) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            display_scaletype.setText("ScaleType is FIT_CENTER");
        } else if (v.getId() == R.id.fitXY) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            display_scaletype.setText("ScaleType is FIT_XY");
        }

    }
}
