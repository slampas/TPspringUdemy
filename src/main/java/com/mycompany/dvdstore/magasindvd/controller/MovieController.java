package com.mycompany.dvdstore.magasindvd.controller;

import java.util.Scanner;

import com.mycompany.dvdstore.magasindvd.entity.Movie;
import com.mycompany.dvdstore.magasindvd.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.magasindvd.service.MovieService;
import com.mycompany.dvdstore.magasindvd.service.MovieServiceInterface;

public class MovieController {


	private MovieServiceInterface movieServiceInterface ;
    //private MovieService movieService = new MovieService();
    private GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();

    public void addUsingConsole(){
        		/*Ajout du titre et genre du film*/
		Movie movie = new Movie();
		String genre;
		String titre;
		System.out.println("--------------------------");
		System.out.println("sasir le titre du film à ajouter ");
		System.out.println("--------------------------");
		Scanner sc = new Scanner(System.in);
		titre = sc.nextLine();
		movie.setTitle(titre);
		System.out.println("--------------------------");
		System.out.println("sasir le genre du film à ajouter ");
		System.out.println("--------------------------");
		genre = sc.nextLine();
		movie.setGenre(genre);
		sc.close();

		
        movieServiceInterface.registerMovie(movie);
        goLiveMovieRepository.add(movie);

    }
    
}
