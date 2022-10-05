package com.apps.bookfarm.Book;

import com.apps.bookfarm.Model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void removeBook(Long id) {
        Optional<Book> deleteBook = bookRepository.findById(id);
        if(deleteBook.isEmpty()){
            throw new IllegalStateException("This book does not exist");
        }

        bookRepository.deleteById(id);

    }

    @Override
    public void addBook(Book book) {


    }

    @Override
    public void updateBook(Book book, Long id) {

    }

}
