package com.softwaredeveloppractice3.usercareapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRunning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);

        Intent intent = getIntent();
        ExerciseItem exerciseItem = intent.getParcelableExtra(ExerciseInfoFragment.EXTRA_FIRST);

        int imageRes = exerciseItem.getImageResource();
        String line1 = exerciseItem.getmText1();
        String line2 = exerciseItem.getmText2();
        String line3 = exerciseItem.getmText3();

        ImageView imageView = findViewById(R.id.image_activity_running);
        imageView.setImageResource(imageRes);

        TextView textView1 = findViewById(R.id.title_activity_running);
        textView1.setText(line1);

        TextView textView2 = findViewById(R.id.cal_activity_running);
        textView2.setText(line2);

        TextView textView3 = findViewById(R.id.content_activity_running);
        textView3.setText(line3);
    }
}
