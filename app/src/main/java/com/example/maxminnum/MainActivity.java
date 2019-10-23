package com.example.maxminnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
int max,min;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[]={4,25,1,23,6,15};
        max=a[0];
        min=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Maximu="+max);
        System.out.println("Minimum="+min);
    }
}
