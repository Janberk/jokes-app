package de.canberk.jokesapp;

import de.canberk.jokesapp.services.JokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesAppApplication.class, args);

	/*
	ApplicationContext ctx = SpringApplication.run(JokesAppApplication.class, args);
	JokeService jokeService = (JokeService) ctx.getBean("jokeService");
	System.out.println(jokeService.getJoke());
	*/
	}

}
