package com.mycompany.dvdstore.magasindvd.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dvdstore.magasindvd.entity.Movie;
import com.mycompany.dvdstore.magasindvd.repository.MovieRepositoryInterface;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired
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
