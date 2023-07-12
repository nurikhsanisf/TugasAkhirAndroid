package com.example.tugasakhir2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListRekomendasiLaptopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        String company = extras.getString("company");
        String product = extras.getString("product");
        String typename = extras.getString("typename");
        String inches = extras.getString("inches");
        String screenresolutiom = extras.getString("screenresolutiom");

        setContentView(R.layout.activity_list_rekomendasi_laptop);
    }
}