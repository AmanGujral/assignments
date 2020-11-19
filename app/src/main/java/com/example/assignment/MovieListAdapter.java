package com.example.assignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieListAdapter extends BaseAdapter {

    ArrayList<ListItemModelClass> list;

    public MovieListAdapter(ArrayList<ListItemModelClass> list){
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_model, null);
        MyViewHolder viewHolder = new MyViewHolder(convertView);
        viewHolder.titleTv.setText(list.get(position).getTitle());
        viewHolder.ratingTv.setText(list.get(position).getRating());
        viewHolder.descriptionTv.setText(list.get(position).getDescription());
        viewHolder.image.setImageResource(Integer.parseInt(list.get(position).getImgSrc()));

        return convertView;
    }
}

class MyViewHolder{

    TextView titleTv;
    TextView ratingTv;
    TextView descriptionTv;
    ImageView image;

    public MyViewHolder(View view){
        titleTv = view.findViewById(R.id.titleTv);
        ratingTv = view.findViewById(R.id.ratingTv);
        descriptionTv = view.findViewById(R.id.descriptionTv);
        image = view.findViewById(R.id.imageView);

    }
}
