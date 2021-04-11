package com.example.mengenalandroid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Tugas3 extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] judul;
    String[] deskripsi;
    int[] images ={
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a91
    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas3);

        recyclerView = findViewById(R.id.tugas3layout);
        judul=getResources().getStringArray(R.array.judul);
        deskripsi=getResources().getStringArray(R.array.deskripsi);

        Tugas3_Adapter Tugas3_Adapter = new Tugas3_Adapter(this, judul, deskripsi, images);
        recyclerView.setAdapter(Tugas3_Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
