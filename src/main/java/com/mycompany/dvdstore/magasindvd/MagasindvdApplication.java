package com.mycompany.dvdstore.magasindvd;

import com.mycompany.dvdstore.magasindvd.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagasindvdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagasindvdApplication.class, args);

		MovieController movieController = new MovieController();
		movieController.addUsingConsole();

	}

}
