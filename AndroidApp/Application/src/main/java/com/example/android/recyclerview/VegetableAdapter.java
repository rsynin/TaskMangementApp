package com.example.android.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android.RetrofitApi.POJO.Vegetable;

import java.util.List;

public class VegetableAdapter extends RecyclerView.Adapter<VegetableAdapter.ViewHolder> {
    private List<Vegetable> data;

    public VegetableAdapter( List<Vegetable> data){
        this.data = data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //this is where we inflate the recycler_view.xml
        View views = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vegetable_item,parent,false);

        return new ViewHolder(views);
    }

    @Override
    public void onBindViewHolder( VegetableAdapter.ViewHolder holder, int position) {
        Vegetable vege = this.data.get(position);
        holder.name.setText(vege.name);
        holder.plantTime.setText(vege.plantTime);
        holder.harvestTime.setText(vege.harvestTime);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView plantTime;
        TextView harvestTime;
        public ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.vegetableName);
            plantTime = view.findViewById(R.id.plantTime);
            harvestTime = view.findViewById(R.id.harvestTime);
        }
    }
}
