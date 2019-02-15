package com.example.safapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
//adapter class to hold the list of online items
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {


    private Context mContext;
    private List<OnlineItems> myItems;

    public RecyclerAdapter(Context mContext, List<OnlineItems> myItems) {
        this.mContext = mContext;
        this.myItems = myItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //here we now display the items to the cardview layout
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview,viewGroup,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        myViewHolder.online_item_title.setText(myItems.get(i).getTittle());
        myViewHolder.img_online_item_img.setImageResource(myItems.get(i).getThumbnail());

        //set click listener

        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //here I am pasing the data to the next activity which is onlineitems activity
                Intent intent =  new Intent(mContext,activity_onlineitems.class );
                intent.putExtra("Title",myItems.get(i).getTittle());
                intent.putExtra("Description",myItems.get(i).getDescription());
                intent.putExtra("Thimbnail",myItems.get(i).getThumbnail());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        //return the size of the the items in the list
        return myItems.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView online_item_title ;
        ImageView img_online_item_img;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            online_item_title = (TextView) itemView.findViewById(R.id.e_commerce_title_id);
            img_online_item_img = (ImageView) itemView.findViewById(R.id.e_commerce_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardView_id);
        }


    }


}
