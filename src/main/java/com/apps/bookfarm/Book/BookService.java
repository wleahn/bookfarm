package com.apps.bookfarm.Book;

import com.apps.bookfarm.Model.Author;
import com.apps.bookfarm.Model.Book;

public interface BookService {
    public Iterable<Book> getBooks();
    public void addNewBook(Book book);

    void addNewAuthor(Author author);

    void addNewAuthor(Author author);

    public void removeBook(Long id);

    void addNewAuthor(Book book);

    void addNewAuthor(Book book);

    void removeBook(int id);
}