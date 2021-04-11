package com.example.mengenalandroid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class Tugas3_Adapter extends RecyclerView.Adapter<Tugas3_Adapter.Tugas3_Holder>{
    String[] data1;
    String[] data2;
    int[] images;
    Context context;

    public Tugas3_Adapter(Context ct, String[] Judul, String[] Deskripsi, int[] img){
        context = ct;
        data1 = Judul;
        data2 = Deskripsi;
        images = img;
    }
    @NonNull
    @Override
    public Tugas3_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.tugas3_row, parent, false);

        return new Tugas3_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Tugas3_Adapter.Tugas3_Holder holder, int position) {
        holder.Judul.setText(data1[position]);
        holder.Deskripsi.setText(data2[position]);
        holder.image.setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(v -> {
            Intent intent = new Intent(context, Tugas3_View.class);
            intent.putExtra("data1", data1[position]);
            intent.putExtra("data2", data2[position]);
            intent.putExtra("image", images[position]);
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            context.startActivity(intent);
        });
    }




    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class Tugas3_Holder extends RecyclerView.ViewHolder{

        TextView Judul, Deskripsi;
        ImageView image;
        ConstraintLayout mainLayout;


        public Tugas3_Holder(@NonNull View itemView) {
            super(itemView);
            Judul = itemView.findViewById(R.id.judul);
            Deskripsi = itemView.findViewById(R.id.deskripsi);
            image = itemView.findViewById(R.id.tugas3_image);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }

    }
}
