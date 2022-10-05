package com.apps.bookfarm.Book;

import com.apps.bookfarm.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByIsbn(int isbn);
    Optional<Book> findByBookTitle(String title);

}
