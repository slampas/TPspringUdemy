package com.mycompany.dvdstore.magasindvd.service;

import com.mycompany.dvdstore.magasindvd.entity.Movie;
import com.mycompany.dvdstore.magasindvd.repository.MovieRepositoryInterface;

public class MovieService {

    private MovieRepositoryInterface movieRepositoryInterface ;
    //private MovieRepository movieRepository = new MovieRepository();
    
    
    public void registerMovie(Movie e){
        movieRepositoryInterface.add(e);

    

        
    }




    
}
