package com.mycompany.dvdstore.magasindvd.repository;

import java.io.FileWriter;
import java.io.IOException;

import com.mycompany.dvdstore.magasindvd.entity.Movie;

public class GoLiveMovieRepository implements MovieRepositoryInterface {



    public void add(Movie movie){

        FileWriter writer;
try{
     writer=new FileWriter("C:\\Users\\33650\\OneDrive\\Bureau\\movies.txt",true);
     writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
     writer.close();
}
catch (IOException e){
     e.printStackTrace();
}
        System.out.println("The movie "+movie.getTitle()+" has been added.");


    }
    
}
