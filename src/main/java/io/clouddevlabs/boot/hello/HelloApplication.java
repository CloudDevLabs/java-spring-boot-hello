package io.clouddevlabs.boot.hello;

import io.clouddevlabs.boot.hello.model.Book;
import io.clouddevlabs.boot.hello.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
			System.out.println("creating some books");
            repository.save(new Book("Jack"));
            repository.save(new Book("Bob"));
            repository.save(new Book("Frank"));
			System.out.println("some books HAVE BEEN CREATED");
        };
    }

}
