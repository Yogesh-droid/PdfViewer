package com.example.pdfviewer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int no_of_tabs;

    public MyPagerAdapter(@NonNull FragmentManager fm,int no_of_tabs) {
        super(fm);
        this.no_of_tabs=no_of_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new JavaFragment();
            case 1:
                return new C_Fragment();
            case 2:
                return new Kotlin_fragment();
            case 3:
                return new Python_fragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return no_of_tabs;
    }
}
