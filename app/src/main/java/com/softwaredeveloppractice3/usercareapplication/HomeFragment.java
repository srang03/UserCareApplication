package com.softwaredeveloppractice3.usercareapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeFragment extends Fragment {
    EditText yValue;
    Button save_Button;


    FirebaseDatabase database;
    DatabaseReference reference;


    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
    GraphView graphView;
    LineGraphSeries series;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);

        yValue = view.findViewById(R.id.yValue_EditText);
        save_Button = view.findViewById(R.id.save_Button);
        graphView = view.findViewById(R.id.graphView);

        series = new LineGraphSeries();
        graphView.addSeries(series);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("charTable");

        setListeners();


        graphView.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter(){
            @Override
            public String formatLabel(double value, boolean isValueX) {

                if(isValueX){
                    return sdf.format(new Date((long) value));
                }
                else{
                    return super.formatLabel(value, isValueX);
                }

            }
        });


       return view;
    }

    private void setListeners() {
        save_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = reference.push().getKey();
                long x = new Date().getTime();
                int y = Integer.parseInt(yValue.getText().toString());

                PointValue pointValue = new PointValue(x, y);

                reference.child(id).setValue(pointValue);

            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                DataPoint [] dp = new DataPoint[(int) dataSnapshot.getChildrenCount()];
                int index = 0;

                for (DataSnapshot myDataSnapshot : dataSnapshot.getChildren()){
                    PointValue pointValue = myDataSnapshot.getValue(PointValue.class);

                    dp[index] = new DataPoint(pointValue.getxValue(), pointValue.getyValue());
                    index ++;

                }
                series.resetData(dp);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}