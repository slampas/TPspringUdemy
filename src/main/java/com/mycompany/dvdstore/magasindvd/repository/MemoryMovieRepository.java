package com.mycompany.dvdstore.magasindvd.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dvdstore.magasindvd.entity.Movie;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private List<Movie> movies=new ArrayList<>();
    public void add(Movie movie){
        movies.add(movie) ;
        System.out.println("***********************************************");
        System.out.println("Thank-you the movie: "+ movie.getTitle()+",added with succes"); 
        System.out.println("***********************************************");       

    }


    
    
}
