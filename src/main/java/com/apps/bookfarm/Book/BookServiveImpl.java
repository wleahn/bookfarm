package com.apps.bookfarm.Book;

import com.apps.bookfarm.Model.Author;
import com.apps.bookfarm.Model.Book;
import com.apps.bookfarm.Book.BookRepository;
import com.apps.bookfarm.Book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void addNewBook(Book book) {

    }

    @Override
    public void addNewAuthor(Author author) {

    }

    @Override
    public void removeBook(Long id) {

    }

    @Override
    public void addNewAuthor(Book book) {
        Optional<Book> optionalBook = bookRepository.findById(book.getIsbn());
        if(!optionalBook.isEmpty()){
            throw new IllegalStateException("Book already exists");
        }else {
            bookRepository.save(book);
        }
    }

    @Override
    public void removeBook(int id) {

    }
}