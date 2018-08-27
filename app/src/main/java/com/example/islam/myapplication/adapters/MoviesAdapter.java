package com.example.islam.myapplication.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.islam.myapplication.R;
import com.example.islam.myapplication.models.Movie;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieHolder> {

    private Context context;

    private ArrayList<Movie> movies;

    OnRecyclerviewClick listener;

    public MoviesAdapter(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    public interface OnRecyclerviewClick {
        void onItemClicked(int position);
    }

    public void setOnRecyclerListenr(OnRecyclerviewClick listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_item, viewGroup, false);


        return new MovieHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder movieHolder, int i) {
        Movie movie = movies.get(i);
        movieHolder.name.setText(movie.getName());
        movieHolder.rate.setText(String.valueOf(movie.getRate()));

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }


    class MovieHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView movieImge;
        TextView name, rate;

        OnRecyclerviewClick listener;

        MovieHolder(View view, OnRecyclerviewClick listener) {
            super(view);
            this.listener = listener;
            movieImge = view.findViewById(R.id.movie_image);
            name = view.findViewById(R.id.movie_name);
            rate = view.findViewById(R.id.movie_rate);

            view.setOnClickListener(this);
            //  movieImge.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onItemClicked(getAdapterPosition());

        }
    }
}
