package com.example.whattimeisit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
    }

    private void setUpViews() {
        TextView lblDate, lblTime;
        Date currDate = new Date();
        lblDate = findViewById(R.id.lblDate);
        lblTime = findViewById(R.id.lblTime);

        lblDate.setText(new SimpleDateFormat("dd/MM/yyyy").format(currDate));
        lblTime.setText(new SimpleDateFormat("hh:mm:ss").format(currDate));
    }
}