package com.example.safapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="RECYCLER";

    //variable for storing the online category of items

    List<OnlineItems> onlineItems;

    //Initialize controls here

    RecyclerView itemsRv;
    RecyclerAdapter itemsRvAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlineItems = new ArrayList<>();
        // These are the parameters:String tittle, String category, String description, int thumbnail
        // Should not be hardcorded. It will be better pulled from a database.
        // Want to load from db Firebase here as my db after testing the hardcorded works well.
        onlineItems.add (new OnlineItems("Blouse", "Women","Women clothes these are",R.drawable.women));
        onlineItems.add (new OnlineItems("Swetter", "Women","Women clothes these are",R.drawable.women));
        onlineItems.add (new OnlineItems("Heals", "Women","Women clothes these are",R.drawable.women));
        onlineItems.add (new OnlineItems("Dress", "Women","Women clothes these are",R.drawable.women));
        onlineItems.add (new OnlineItems("Skatter Skirt", "Women","Women clothes these are",R.drawable.women));
        onlineItems.add (new OnlineItems("smart cassual trouser", "Women","Women clothes these are",R.drawable.women));
        onlineItems.add (new OnlineItems("Jeans", "Women","Women clothes these are",R.drawable.women));


        Log.d(TAG, "Online Items: successfully added to the list" );

        itemsRv = (RecyclerView) findViewById(R.id.my_recycler_view);
        itemsRvAdapter = new RecyclerAdapter(this,onlineItems);
        itemsRv.setLayoutManager(new GridLayoutManager(this,2));
        itemsRv.setAdapter(itemsRvAdapter);

    }
}
