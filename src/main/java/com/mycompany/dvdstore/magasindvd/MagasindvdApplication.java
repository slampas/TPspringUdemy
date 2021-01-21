package com.mycompany.dvdstore.magasindvd;

import com.mycompany.dvdstore.magasindvd.controller.MovieController;
import com.mycompany.dvdstore.magasindvd.repository.FileMovieRespository;
import com.mycompany.dvdstore.magasindvd.service.DefaultMovieService;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagasindvdApplication {

        public static void main(String[] args) {

                MovieController movieController = new MovieController();
                FileMovieRespository goLiveMovieRepository = new FileMovieRespository();
                DefaultMovieService movieService = new DefaultMovieService();

                movieController.setMovieServiceInterface(movieService);
                movieService.setMovieRepositoryInterface(goLiveMovieRepository);
                movieController.addUsingConsole();

        }

}
