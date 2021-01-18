package com.mycompany.dvdstore.magasindvd.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dvdstore.magasindvd.entity.Movie;

public class MovieRepository {

    private List <Movie> movies = new ArrayList<>();
    public void add(Movie e){
        movies.add(e) ;
        System.out.println("---------------------------");
        System.out.println("the movie added with succes"); 
        System.out.println("---------------------------");       

    }
    
}
