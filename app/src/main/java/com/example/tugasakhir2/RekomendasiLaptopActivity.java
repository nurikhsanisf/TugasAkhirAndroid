package com.example.tugasakhir2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tugasakhir2.Model.RekomendasiLaptop;
import com.example.tugasakhir2.Api.Client;
import com.example.tugasakhir2.Api.Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RekomendasiLaptopActivity extends AppCompatActivity {

    Button rekomendasi;
    Spinner company, produk, typename, inches, screenresolution, cpu, ram, memory, gpu, opsis, weight;
    Interface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasi_laptop);

        rekomendasi = (Button)findViewById(R.id.R_btn_1);
        company = (Spinner)findViewById(R.id.RL_company);
        produk = (Spinner)findViewById(R.id.RL_produk);
        typename = (Spinner)findViewById(R.id.RL_typename);
        inches = (Spinner)findViewById(R.id.RL_inches);
        screenresolution = (Spinner)findViewById(R.id.RL_screenR);
        cpu = (Spinner)findViewById(R.id.R_cpu);
        ram = (Spinner)findViewById(R.id.RL_ram);
        memory = (Spinner)findViewById(R.id.RL_memory);
        gpu = (Spinner)findViewById(R.id.RL_gpu);
        opsis = (Spinner)findViewById(R.id.RL_opsis);
        weight = (Spinner)findViewById(R.id.RL_weight);

        mApiInterface = Client.getClient().create(Interface.class);

        rekomendasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Call<RekomendasiLaptop> postRekomendasiLaptopExce = mApiInterface.postRekomendasi(company.getSelectedItem().toString(),
                        produk.getSelectedItem().toString(), typename.getSelectedItem().toString(), inches.getSelectedItem().toString(),
                        screenresolution.getSelectedItem().toString(), cpu.getSelectedItem().toString(), ram.getSelectedItem().toString(),
                        memory.getSelectedItem().toString(), gpu.getSelectedItem().toString(), opsis.getSelectedItem().toString(),
                        weight.getSelectedItem().toString());
                postRekomendasiLaptopExce.enqueue(new Callback<RekomendasiLaptop>() {
                    @Override
                    public void onResponse(Call<RekomendasiLaptop> call, Response<RekomendasiLaptop> response) {

                        if(response.isSuccessful()){
                            RekomendasiLaptop a = response.body();
                            System.out.println(a.getInches());
                            /*Log.v("log softgain : ", String.valueOf(response.body().getSuccess().getToken()));*/
//                            Toast.makeText(getApplicationContext(),
//                                    "Login berhasil",Toast.LENGTH_SHORT).show();
//
//                            SharedPreferences sgSharedPref = getApplicationContext().getSharedPreferences("sg_shared_pref", getApplicationContext().MODE_PRIVATE);
//                            SharedPreferences.Editor editor = sgSharedPref.edit();
//                            String token = String.valueOf(response.body().getId());
//                            editor.putString("token", token);
//                            editor.apply();

//                            startActivity(new Intent(RekomendasiLaptopActivity.this, MainActivity.class));
                            Bundle bundle = new Bundle();
                            bundle.putString("company", a.getCompany());
                            bundle.putString("product", a.getProduct());
                            bundle.putString("typename", a.getTypename());
                            bundle.putString("inches", a.getInches());
                            bundle.putString("screenresolutiom", a.getScreenResolution());
//                            bundle.putString("company", a.getCompany());
                            Intent i = new Intent(RekomendasiLaptopActivity.this, ListRekomendasiLaptopActivity.class);
                            i.putExtras(bundle);
                            startActivity(i);
                        }else{
//                            Toast.makeText(getApplicationContext() ,"Login gagal",Toast.LENGTH_SHORT).show();
                                Toast.makeText(getApplicationContext(), response.errorBody().toString(),Toast.LENGTH_SHORT).show(); // this will tell you why your api doesnt work most of time
                        }
                    }

                    @Override
                    public void onFailure(Call<RekomendasiLaptop> call, Throwable t) {
                        System.out.println(t);

                    }
                });

            }
        });
    }
}
//    }
//}