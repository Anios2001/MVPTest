package com.example.mvptest;

import android.os.Handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model implements Contract.Model{
    List<String> datalist= Arrays.asList("JAVA FULL ","HTML CSS JAVASCRIPT","ANDROID DEVELOPMENT FULL","DATA STRUCTURES FULL",
                                          "DISCRETE STRUCTURES");



    @Override
    public void getNextCourse(OnFinishedListener onFinishedListener) {
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   onFinishedListener.OnFinished(getRandomString());
               }
           },1200);
    }
    public String getRandomString(){
        Random random=new Random();
        int index=random.nextInt(datalist.size());
        return datalist.get(index);
    }
}
