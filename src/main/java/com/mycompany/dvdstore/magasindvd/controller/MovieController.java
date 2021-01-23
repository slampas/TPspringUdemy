package com.mycompany.dvdstore.magasindvd.controller;

import java.util.Scanner;
import com.mycompany.dvdstore.magasindvd.entity.Movie;

import com.mycompany.dvdstore.magasindvd.service.MovieServiceInterface;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class MovieController {

	@Autowired
	private MovieServiceInterface movieServiceInterface;

	public void addUsingConsole() {

		System.out.println("What is the movie title?");
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		System.out.println("What is the movie genre?");
		String genre = scanner.nextLine();
		scanner.close();
		Movie movie = new Movie();
		movie.setTitle(title);
		movie.setGenre(genre);

		movieServiceInterface.registerMovie(movie);

	}

	public MovieServiceInterface getMovieServiceInterface() {
		return movieServiceInterface;
	}

	public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
		this.movieServiceInterface = movieServiceInterface;
	}

}
