package com.example.islam.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;

import com.example.islam.myapplication.adapters.MoviesAdapter;
import com.example.islam.myapplication.fragments.FragmentAdapter;
import com.example.islam.myapplication.fragments.PopulrFragment;
import com.example.islam.myapplication.models.Movie;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        tabLayout = findViewById(R.id.frag_tab);
        viewPager = findViewById(R.id.fra_pager);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.addTab(tabLayout.newTab().setText("Top Rated"));
        tabLayout.addTab(tabLayout.newTab().setText("TV"));
        tabLayout.addTab(tabLayout.newTab().setText("Popular"));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

}
