package com.softwaredeveloppractice3.usercareapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {
    private ArrayList<ExerciseItem> mExerciseList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTitleTextView;
        public TextView mContentTextView;

        public ExerciseViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTitleTextView = itemView.findViewById(R.id.titleTextView);
            mContentTextView = itemView.findViewById(R.id.contentTextView);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public ExerciseAdapter(ArrayList<ExerciseItem> exerciseList) {
        mExerciseList = exerciseList;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_info, parent, false);
       ExerciseViewHolder evh = new ExerciseViewHolder(v, mListener);
       return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        ExerciseItem currentItem = mExerciseList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTitleTextView.setText(currentItem.getmText1());
        holder.mContentTextView.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mExerciseList.size();
    }
}
