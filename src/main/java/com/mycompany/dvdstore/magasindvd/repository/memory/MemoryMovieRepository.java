package com.mycompany.dvdstore.magasindvd.repository.memory;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dvdstore.magasindvd.entity.Movie;
import com.mycompany.dvdstore.magasindvd.repository.MovieRepositoryInterface;

import org.springframework.stereotype.Repository;


@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    private List<Movie> movies=new ArrayList<>();
    public void add(Movie movie){
        movies.add(movie) ;
        System.out.println("***********************************************");
        System.out.println("Thank-you the movie: "+ movie.getTitle()+",added with succes"); 
        System.out.println("***********************************************");       

    }


    
    
}
