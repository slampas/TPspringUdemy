package com.mycompany.dvdstore.magasindvd.controller;

import java.util.Scanner;
import com.mycompany.dvdstore.magasindvd.entity.Movie;

import com.mycompany.dvdstore.magasindvd.service.MovieServiceInterface;

public class MovieController {

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
