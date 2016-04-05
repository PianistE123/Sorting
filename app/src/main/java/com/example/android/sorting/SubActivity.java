package com.example.android.sorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent child = getIntent();
        String art = child.getStringExtra("a");
        String inf = child.getStringExtra("i");
        int imageId = child.getIntExtra("id",0);
        description(art,inf,imageId);
    }

    public void description(String article,String inf,int id){
        TextView art = (TextView)findViewById(R.id.article_text_view);
        TextView information = (TextView)findViewById(R.id.information_text_view);
        art.setText(article);
        information.setText(inf);
    }
}
