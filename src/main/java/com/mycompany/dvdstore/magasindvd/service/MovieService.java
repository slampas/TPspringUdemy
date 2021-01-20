package com.mycompany.dvdstore.magasindvd.service;

import com.mycompany.dvdstore.magasindvd.entity.Movie;
//import com.mycompany.dvdstore.magasindvd.repository.MovieRepository;
import com.mycompany.dvdstore.magasindvd.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface {

    private MovieRepositoryInterface movieRepositoryInterface;
    // private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie) {
        movieRepositoryInterface.add(movie);

    }

}
