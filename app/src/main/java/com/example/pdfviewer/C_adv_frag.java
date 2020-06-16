package com.example.pdfviewer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class C_adv_frag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.c_adv_frag_layout, container, false);
        RecyclerView recyclerView=v.findViewById(R.id.recycler2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        String[]topics=getResources().getStringArray(R.array.c_topic_list);
        JavaAdapter adapter=new JavaAdapter(topics,getActivity());
        recyclerView.setAdapter(adapter);

        return v;
    }

}
