package com.example.mengenalandroid;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tugas3_View extends AppCompatActivity {

    ImageView tugas3_detail_img;
    TextView judul_detil;
    TextView deskripsi_detil;

    String data1, data2;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        System.out.println("WWWOOOOOO!!!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tugas3_details);

        tugas3_detail_img = findViewById(R.id.tugas3_detail_img);
        judul_detil = findViewById(R.id.judul_detil);
        deskripsi_detil = findViewById(R.id.deskripsi_detil);

        getData();
        setData();
    }

    private void getData() {
        data1 = getIntent().getStringExtra("data1");
        data2 = getIntent().getStringExtra("data2");
        image = getIntent().getIntExtra("image", 1);
    }
    private void setData(){
        judul_detil.setText(data1);
        deskripsi_detil.setText(data2);
        tugas3_detail_img.setImageResource(image);
    }
}
