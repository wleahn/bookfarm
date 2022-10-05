package com.apps.bookfarm.Book;

import com.apps.bookfarm.Model.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BookService {

    public List<Book> getBooks();


    public void removeBook(Long id);



    void addBook(Book book);

    void updateBook(@RequestBody Book book , @PathVariable Long id);
}