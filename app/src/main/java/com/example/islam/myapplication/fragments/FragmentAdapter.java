package com.example.islam.myapplication.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return new PopulrFragment();

            case 1:
                return new TvShowsFragment();
            case 2:
                return new TopRatedFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
