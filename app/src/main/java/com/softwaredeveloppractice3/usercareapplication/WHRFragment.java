package com.softwaredeveloppractice3.usercareapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class WHRFragment extends Fragment {

    TextInputEditText ageEditText, heightEditText, waistEditText;
    TextInputLayout input_age, input_height, input_waist;

    ProgressBar WHRresultProgressBar;
    TextView WHRresultTextview, WHRTextView;
    float Whtresult, mywaist, myheight;
    String StringinputHeight;
    String StringinputWaist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_whr, null);
        input_age = view.findViewById(R.id.input_age);
        input_height = view.findViewById(R.id.input_height);
        input_waist = view.findViewById(R.id.input_waist);

        ageEditText =  view.findViewById(R.id.ageEditText);
        heightEditText = view.findViewById(R.id.heightEditText);
        waistEditText =  view.findViewById(R.id.waistEditText);
        WHRresultProgressBar = view.findViewById(R.id.WHRresultProgressBar);
        WHRresultTextview = view.findViewById(R.id.WHRresultTextview);
        WHRTextView =view.findViewById(R.id.WHRTextView);

        heightEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                StringinputHeight = input_height.getEditText().getText().toString().trim();
                if(i2== 0){
                    StringinputHeight = "0.0";
                }
                    myheight = Float.valueOf(StringinputHeight);
                    if(myheight != 0 && mywaist != 0){
                        Whtresult = (mywaist / myheight) ;
                        WHRresultTextview.setText(String.format("%.02f", Whtresult));
                        BMIColor(WHRresultTextview, WHRTextView);
                    }
                    else
                        Whtresult = 0;



            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });




        waistEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                    StringinputWaist = input_waist.getEditText().getText().toString().trim();
                if(i2==0){
                    StringinputWaist = "0.0";
                }
                    mywaist = Float.valueOf(StringinputWaist);
                    if(myheight != 0 && mywaist != 0){
                        Whtresult = (mywaist / myheight);
                        WHRresultTextview.setText(String.format("%.02f", Whtresult));
                        BMIColor(WHRresultTextview, WHRTextView);

                    }
                    else
                        Whtresult = 0;



            }


            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        return view;

    }

    public void BMIColor(TextView textView, TextView textView2){
        if(Whtresult < 0.35 || Whtresult == 35) {
            textView.setTextColor(getResources().getColor(R.color.color1));
            textView2.setTextColor(getResources().getColor(R.color.color1));
        }
        else if(Whtresult < 0.42 || Whtresult == 0.42){
            textView.setTextColor(getResources().getColor(R.color.color11));
            textView2.setTextColor(getResources().getColor(R.color.color11));
        }
        else if(Whtresult < 0.52 || Whtresult == 0.52){
            textView.setTextColor(getResources().getColor(R.color.color2));
            textView2.setTextColor(getResources().getColor(R.color.color2));
        }
        else if(Whtresult < 0.57 || Whtresult == 0.57){
            textView.setTextColor(getResources().getColor(R.color.color3));
            textView2.setTextColor(getResources().getColor(R.color.color3));
        }
        else if(Whtresult < 0.62 || Whtresult == 0.62){
            textView.setTextColor(getResources().getColor(R.color.color4));
            textView2.setTextColor(getResources().getColor(R.color.color4));
        }
        else {
            textView.setTextColor(getResources().getColor(R.color.color5));
            textView2.setTextColor(getResources().getColor(R.color.color5));
        }

    }
    }

