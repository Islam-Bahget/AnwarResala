package com.example.islam.myapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.islam.myapplication.Details;
import com.example.islam.myapplication.R;
import com.example.islam.myapplication.adapters.MoviesAdapter;
import com.example.islam.myapplication.models.Movie;

import java.util.ArrayList;

public class PopulrFragment extends Fragment implements MoviesAdapter.OnRecyclerviewClick {


    ArrayList<Movie> arrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.popular_fragment, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        arrayList.add(new Movie("Movie1", "", 7.8));
        arrayList.add(new Movie("Movie2", "", 7.8));
        arrayList.add(new Movie("Movie3", "", 7.8));
        arrayList.add(new Movie("Movie4", "", 7.8));

        RecyclerView recyclerView = view.findViewById(R.id.popular_recycler);

        GridLayoutManager manager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(manager);
        MoviesAdapter adapter = new MoviesAdapter(getContext(), arrayList);
        adapter.setOnRecyclerListenr(this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClicked(int position) {
        Movie movie = arrayList.get(position);
        Intent intent = new Intent(getContext(), Details.class);
        intent.putExtra("movie", movie);
        startActivity(intent);

    }
}
