package com.geeks.tilek_talaibekov_hw_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geeks.tilek_talaibekov_hw_3_4.continent.ContinentFragment;
import com.geeks.tilek_talaibekov_hw_3_4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment())
                    .commit();
        }
    }
}