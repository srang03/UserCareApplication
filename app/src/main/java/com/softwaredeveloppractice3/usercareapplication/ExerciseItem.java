package com.softwaredeveloppractice3.usercareapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class ExerciseItem implements Parcelable {
    private  int mImageResource;
    private String mText1;
    private String mText2;
    private String mText3;

    public ExerciseItem(int imageResource, String text1, String text2, String text3){
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
    }

    protected ExerciseItem(Parcel in) {
        mImageResource = in.readInt();
        mText1 = in.readString();
        mText2 = in.readString();
        mText3 = in.readString();
    }

    public static final Creator<ExerciseItem> CREATOR = new Creator<ExerciseItem>() {
        @Override
        public ExerciseItem createFromParcel(Parcel in) {
            return new ExerciseItem(in);
        }

        @Override
        public ExerciseItem[] newArray(int size) {
            return new ExerciseItem[size];
        }
    };

    public int getImageResource() {
        return mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }

    public String getmText3() {
        return mText3;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mImageResource);
        parcel.writeString(mText1);
        parcel.writeString(mText2);
        parcel.writeString(mText3);
    }
}
