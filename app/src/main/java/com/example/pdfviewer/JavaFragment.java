package com.example.pdfviewer;


import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class JavaFragment extends Fragment {
    CardView basic,adv,cheats,vid;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.java_frag_layout, container, false);
        view.getBackground().setAlpha(100);
       basic=view.findViewById(R.id.java_basic);
       adv=view.findViewById(R.id.java_adv);
       cheats=view.findViewById(R.id.java_cheats);
       vid=view.findViewById(R.id.java_vid);

       basic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(),Java_content_activity.class);
               intent.putExtra("card","basic");
               startActivity(intent);
           }
       });

        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Java_content_activity.class);
                intent.putExtra("card","adv");
                startActivity(intent);
            }
        });

        cheats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Java_content_activity.class);
                intent.putExtra("card","cheats");
                startActivity(intent);
            }
        });

        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Java_content_activity.class);
                intent.putExtra("card","vid");
                startActivity(intent);
            }
        });


        return view;
    }

}
