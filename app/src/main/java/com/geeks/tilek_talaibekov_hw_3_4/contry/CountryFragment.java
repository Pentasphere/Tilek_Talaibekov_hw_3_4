package com.geeks.tilek_talaibekov_hw_3_4.contry;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.tilek_talaibekov_hw_3_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private int position;
    private ArrayList<CountryModel> countryList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        CountryAdapter adapter = new CountryAdapter(countryList);
        binding.rvCountries.setAdapter(adapter);
    }

    private void checkPosition(int position) {
        if (position == 0) {
            loadEurasia();
        } else if (position == 1) {
            loadAfrica();
        } else if (position == 2) {
            loadNorthAmerica();
        } else if (position == 3) {
            loadSouthAmerica();
        } else if (position == 4) {
            loadAustralia();
        }
    }

    private void loadAustralia() {
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Canberra_montage_2.jpg/290px-Canberra_montage_2.jpg", "Канберра"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Melbourne%2C_Australia_montage.png/272px-Melbourne%2C_Australia_montage.png", "Мельбурн"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Perth_montage_2.jpg/286px-Perth_montage_2.jpg", "Перт"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Sunsets_of_Brisbane%2C_Queensland%2C_September_2021%2C_01.jpg/270px-Sunsets_of_Brisbane%2C_Queensland%2C_September_2021%2C_01.jpg", "Брисбен"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Sydney_montage_2018.jpg/254px-Sydney_montage_2018.jpg", "Сидней"));
    }

    private void loadEurasia() {
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/0/03/Flag_of_Italy.svg", "Италия"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/b/ba/Flag_of_Germany.svg", "Германия"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/1200px-Flag_of_the_United_Kingdom_%281-2%29.svg.png", "Великобритания"));
        countryList.add(new CountryModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSG24QVtqDWYqBksVSyK1yULlQWKw_HXQ853vdS-3M5dwS_n4MdgL35AF2WfI&s=10", "Франция"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/0/08/Flag_of_Switzerland_%28Pantone%29.svg", "Швейцария"));
    }

    private void loadSouthAmerica() {
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/0/05/Flag_of_Brazil.svg", "Бразилия"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/1/1a/Flag_of_Argentina.svg", "Аргентина"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/2/21/Flag_of_Colombia.svg", "Колумбия"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/800px-Flag_of_Peru_%28state%29.svg.png", "Перу"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/7/78/Flag_of_Chile.svg", "Чили"));
    }

    private void loadNorthAmerica() {
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/a/a4/Flag_of_the_United_States.svg", "Соединенные штаты Америки"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/d/d9/Flag_of_Canada_%28Pantone%29.svg", "Канада"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/f/fc/Flag_of_Mexico.svg", "Мексика"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/0/09/Flag_of_Greenland.svg", "Гренландия"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/b/bd/Flag_of_Cuba.svg", "Куба"));
    }

    private void loadAfrica() {
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/7/79/Flag_of_Nigeria.svg", "Нигерия"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/4/49/Flag_of_Kenya.svg", "Кения"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/f/f4/Flag_of_Niger.svg", "Нигер"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/2/2c/Flag_of_Morocco.svg", "Марокко"));
        countryList.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/1/19/Flag_of_Ghana.svg", "Гана"));
    }

}