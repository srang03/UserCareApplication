package com.softwaredeveloppractice3.usercareapplication;

import android.app.UiModeManager;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rtugeek.android.colorseekbar.ColorSeekBar;

import org.w3c.dom.Text;

public class CheckFragment extends Fragment {
    private TextView textviewWeight, textviewHeight, BMIresultTextview ,BMIColorTextview;
    private SeekBar weightSeekBar, heightSeekBar;
    private ProgressBar weightProgressBar, heightProgressBar, BMIresultProgressBar;
    private int height= 0, weight = 0;
    private float BMI;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_check, null);
        BMIColorTextview = view.findViewById(R.id.BMIColorTextview);
        textviewWeight = view.findViewById(R.id.textviewWeight);
        textviewHeight = view.findViewById(R.id.textviewHeight);
        BMIresultTextview = view.findViewById(R.id.BMIresultTextview);
        weightProgressBar = view.findViewById(R.id.weightProgressBar);
        heightProgressBar = view.findViewById(R.id.heightProgressBar);
        BMIresultProgressBar =  view.findViewById(R.id.BMIresultProgressBar);

        weightSeekBar = view.findViewById(R.id.weightSeekBar);
        heightSeekBar = view.findViewById(R.id.heightSeekBar);

        weightSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                weightProgressBar.setProgress(i);
                weight = i;
                textviewWeight.setText(Integer.toString(i));
                if(weight != 0 && height != 0){
                    BMI = (10000f * i / (height * height));
                }
                else
                    BMI = 0.0f;

                if(BMI > 60.0){
                    BMI = 60.0f;
                }
                BMIColor(BMIresultTextview, BMIColorTextview);
                BMIresultProgressBar.setProgress((int)BMI);
                String strBim = String.format("%.2f", BMI);
                BMIresultTextview.setText(strBim);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        heightSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                heightProgressBar.setProgress(i);
                height = i;
                textviewHeight.setText(Integer.toString(i));
                if(weight != 0 && height != 0){
                    BMI = (10000f * weight / (i * i));
                }
                else
                    BMI = 0.0f;

                if(BMI > 60.0){
                    BMI = 60.0f;
                }

                BMIColor(BMIresultTextview, BMIColorTextview);


                BMIresultProgressBar.setProgress((int)BMI);
                String strBim = String.format("%.2f", BMI);
                BMIresultTextview.setText(strBim);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });






//        HeightTextView = view.findViewById(R.id.HeightTextView);
//        ColorSeekBar colorSeekBar = view.findViewById(R.id.color_seek_bar);
//        colorSeekBar.setOnColorChangeListener(new ColorSeekBar.OnColorChangeListener() {
//            @Override
//            public void onColorChangeListener(int colorBarPosition, int alphaBarPosition, int color) {
//                HeightTextView.setTextColor(color);
//
//            }
//        });
        return view;
    }
    public void BMIColor(TextView textView, TextView textView2){
        if(BMI < 18.4) {
            textView.setTextColor(getResources().getColor(R.color.color1));
            textView2.setTextColor(getResources().getColor(R.color.color1));
        }
        else if(BMI < 23.1){
            textView.setTextColor(getResources().getColor(R.color.color2));
            textView2.setTextColor(getResources().getColor(R.color.color2));
        }
        else if(BMI < 25.1){
            textView.setTextColor(getResources().getColor(R.color.color3));
            textView2.setTextColor(getResources().getColor(R.color.color3));
        }
        else if(BMI < 30.1){
            textView.setTextColor(getResources().getColor(R.color.color4));
            textView2.setTextColor(getResources().getColor(R.color.color4));
        }
        else {
            textView.setTextColor(getResources().getColor(R.color.color5));
            textView2.setTextColor(getResources().getColor(R.color.color5));
        }

    }
}
