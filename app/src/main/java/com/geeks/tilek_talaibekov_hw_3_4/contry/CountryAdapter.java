package com.geeks.tilek_talaibekov_hw_3_4.contry;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.tilek_talaibekov_hw_3_4.R;
import com.geeks.tilek_talaibekov_hw_3_4.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<CountryModel> countryList = new ArrayList<>();

    public CountryAdapter(ArrayList<CountryModel> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
class CountryViewHolder extends RecyclerView.ViewHolder{
    private TextView tvName;
    private ImageView imgCountry;
    private ItemCountryBinding binding;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name_country);
        imgCountry = itemView.findViewById(R.id.img_map_country);
        this.binding = binding;
    }

    public void onBind(CountryModel country){
        tvName.setText(country.getName());
        Glide.with(imgCountry).load(country.getImg()).into(imgCountry);
    }
}
