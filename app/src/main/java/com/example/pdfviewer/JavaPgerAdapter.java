package com.example.pdfviewer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class JavaPgerAdapter extends FragmentPagerAdapter {

    int no_of_tabs;

    public JavaPgerAdapter(@NonNull FragmentManager fm,int no_of_tabs) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.no_of_tabs=no_of_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new C_basic_frag();
            case 1:
                return new C_adv_frag();
            case 2:
                return new C_cheats_frag();
            case 3:
                return new C_video_frag();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return no_of_tabs;
    }
}
