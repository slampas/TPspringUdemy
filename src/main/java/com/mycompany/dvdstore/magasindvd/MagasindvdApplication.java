package com.mycompany.dvdstore.magasindvd;

import java.util.Scanner;

import com.mycompany.dvdstore.magasindvd.entity.Movie;
import com.mycompany.dvdstore.magasindvd.service.MovieService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagasindvdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagasindvdApplication.class, args);

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

		MovieService movieService = new MovieService();
		movieService.registerMovie(movie);


	}

}
