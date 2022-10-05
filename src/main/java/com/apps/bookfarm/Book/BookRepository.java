package com.apps.bookfarm.Book;

import com.apps.bookfarm.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

  //  List<Book> findByIsbn(int isbn);
   // Optional<Book> findByBookTitle(String title);

}
