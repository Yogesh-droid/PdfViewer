package com.example.pdfviewer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JavaAdapter extends RecyclerView.Adapter<JavaAdapter.ViewHolder> {

    String[]arrayList;
    Context context;

    public JavaAdapter(String[] arrayList, Context context) {
        this.arrayList = arrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.java_adapter_lay,null);

        ViewHolder holder=new ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull JavaAdapter.ViewHolder holder, int position) {
        holder.textView.setText(arrayList[position]);
    }

    @Override
    public int getItemCount() {
        return arrayList.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView=itemView.findViewById(R.id.textView2);
            itemView.setClickable(true);
            itemView.setFocusable(true);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,JavaTopicDetail.class);
                    intent.putExtra("position",getLayoutPosition());
                    context.startActivity(intent);
                }
            });
        }
    }
}

