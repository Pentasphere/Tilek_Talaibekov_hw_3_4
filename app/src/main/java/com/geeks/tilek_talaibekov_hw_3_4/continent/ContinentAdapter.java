package com.geeks.tilek_talaibekov_hw_3_4.continent;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.tilek_talaibekov_hw_3_4.OnItemClick;
import com.geeks.tilek_talaibekov_hw_3_4.R;
import com.geeks.tilek_talaibekov_hw_3_4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<ContinentModel> continentList = new ArrayList<>();
    private OnItemClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentList, OnItemClick onClick) {
        this.continentList = continentList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onClick.onItemClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}
class ContinentViewHolder extends RecyclerView.ViewHolder{
    private TextView tvName;
    private ImageView imgContinent;
    private ItemContinentBinding binding;

    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name_continent);
        imgContinent = itemView.findViewById(R.id.img_continent);
        this.binding = binding;
    }

    public void onBind(ContinentModel model){
        tvName.setText(model.getName());
        Glide.with(imgContinent).load(model.getImg()).into(imgContinent);
    }
}
