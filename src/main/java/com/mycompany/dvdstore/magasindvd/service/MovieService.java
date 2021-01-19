package com.mycompany.dvdstore.magasindvd.service;

import com.mycompany.dvdstore.magasindvd.entity.Movie;
import com.mycompany.dvdstore.magasindvd.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();
    
    
    public void registerMovie(Movie e){
        movieRepository.add(e);

    

        
    }




    
}
