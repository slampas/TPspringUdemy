package com.mycompany.dvdstore.magasindvd.service;

import com.mycompany.dvdstore.magasindvd.entity.Movie;
import com.mycompany.dvdstore.magasindvd.repository.MovieRepositoryInterface;

public class DefaultMovieService implements MovieServiceInterface {

    private MovieRepositoryInterface movieRepositoryInterface;


    public void registerMovie(Movie movie) {
        movieRepositoryInterface.add(movie);

    }

    public MovieRepositoryInterface getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepository) {
        this.movieRepositoryInterface = movieRepository;
    }
}
