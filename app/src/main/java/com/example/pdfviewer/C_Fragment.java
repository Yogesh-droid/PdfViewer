package com.example.pdfviewer;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;



public class C_Fragment extends Fragment {

    ViewPager pager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.c_layout, container, false);
        view.getBackground().setAlpha(100);

        TabLayout tabLayout=view.findViewById(R.id.tablayout2);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#D81B60"));
        tabLayout.setTabTextColors(Color.parseColor("#F8F9FA"),Color.parseColor("#D81B60"));


        pager=view.findViewById(R.id.viewpager2);
        JavaPgerAdapter adapter=new JavaPgerAdapter(getActivity().getSupportFragmentManager()
                ,tabLayout.getTabCount());
        pager.setAdapter(adapter);

        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        return view;
    }

}
