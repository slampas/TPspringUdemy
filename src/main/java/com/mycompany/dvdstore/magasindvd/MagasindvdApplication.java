package com.mycompany.dvdstore.magasindvd;

import com.mycompany.dvdstore.magasindvd.controller.MovieController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MagasindvdApplication {

        public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
                MovieController movieController = context.getBean(MovieController.class);
                movieController.addUsingConsole();

        }

}
