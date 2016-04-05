package com.example.android.sorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void infAboutQuick(View view){
        String article ="Быстрая сортировка";
        String infa = "";
        int imageId = 1;
        switchViews(article, infa, imageId);
    }

    public void infAboutBubbles(View view){
        String article ="Пузырьковая сортировка";
        String infa = "";
        int imageId = 2;
        switchViews(article, infa, imageId);
    }

    public void infAboutChet(View view){
        String article ="Чётно-нечётная сортировка";
        String infa = "";
        int imageId = 3;
        switchViews(article, infa, imageId);
    }

    public void infAboutShake(View view){
        String article ="Сортировка перемешиванием";
        String infa = "";
        int imageId = 4;
        switchViews(article, infa, imageId);
    }

    public void infAboutChes(View view){
        String article ="Сортировка рассчёской";
        String infa = "";
        int imageId = 5;
        switchViews(article, infa, imageId);
    }

    public void infAboutSilly(View view){
        String article ="\"Глупая\" сортировка";
        String infa = "";
        int imageId = 6;
        switchViews(article, infa, imageId);
    }

    public void switchViews(String a, String inf, int id){
        Intent i = new Intent(this, SubActivity.class);
        i.putExtra("a",a);
        i.putExtra("i",inf);
        i.putExtra("id",id);
        startActivity(i);
    }
}
