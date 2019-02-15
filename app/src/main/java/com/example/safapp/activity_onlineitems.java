package com.example.safapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_onlineitems extends AppCompatActivity {

    private TextView txtTitle, txtDescription;
    private ImageView imgItemview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlineitems);

        txtTitle = (TextView) findViewById(R.id.txt_title);
        txtDescription = (TextView)  findViewById(R.id.txt_desc);
        imgItemview = (ImageView)  findViewById(R.id.item_id);

        //receive the items

        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String description = intent.getExtras().getString("Description");

        int imagei =intent.getExtras().getInt("Thimbnail");

        txtTitle.setText(title);
        txtDescription.setText(description);
        imgItemview.setImageResource(imagei);
    }
}
