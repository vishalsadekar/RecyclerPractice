package com.example.appdea.recyclerpractice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by maac on 22-Jan-18.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Movie> movieList;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title,year,genre;
        public MyViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            year=itemView.findViewById(R.id.year);
            genre=itemView.findViewById(R.id.genre);
        }
    }

    public MoviesAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {     //Here onCreateViewHolder() method inflates movie_list_row.xml


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {  //In onBindViewHolder() method the appropriate movie data (title, genre and year) set to each row.

        Movie movie=movieList.get(position);
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        holder.title.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


}
