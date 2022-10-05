package com.apps.bookfarm;

import com.apps.bookfarm.Model.Author;
import com.apps.bookfarm.Author.AuthorRepository;
import com.apps.bookfarm.Model.Book;
import com.apps.bookfarm.Book.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DatabaseLoader {
    public static final Logger log = (Logger) LoggerFactory.getLogger(DatabaseLoader.class);

    @Bean
    CommandLineRunner initDatabase (AuthorRepository authorRepository, BookRepository bookRepository){
        return args -> {
            authorRepository.save(new Author("Mike Wallace", 23456));
            authorRepository.save(new Author("Kate Williams", 23567));
            authorRepository.save(new Author("John Mutiso", 56789));

           bookRepository.save(new Book("The Art of CS",  "MacMillan", 26383655, 200, "CS"));

            authorRepository.findAll().forEach(author -> log.info("Preload Author: " + author));
            bookRepository.findAll().forEach(book -> log.info("Preload Book: " + book));
        };
    }
}
