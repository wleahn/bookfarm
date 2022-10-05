package com.apps.bookfarm.Book;

import com.apps.bookfarm.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    private final BookRepository bookRepository;
    private final BookServiceImpl bookService;

    @Autowired
    public BookController(BookRepository bookRepository, BookServiceImpl bookService) {
        this.bookRepository = bookRepository;
        this.bookService = bookService;
    }

    //Aggregate root
    @GetMapping("/books")
    Iterable<Book> allBooks() {
        return bookService.getBooks();
    }
    //end::get-aggregate-root[]

    @GetMapping("/Books/{id}")
    Book oneBook(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    @PostMapping("/books/{id}")
    Book addBook(@RequestBody Book book, @PathVariable Long id) {
        return bookRepository.save(book);
    }

    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
    }

    @PutMapping("books/{id}")
    Book replaceBook(@RequestBody Book newBook, @PathVariable Long id){
        return bookRepository.findById(id).map(book -> {
            book.setTitle(newBook.getTitle());
            book.setIsbn(newBook.getIsbn());
            return bookRepository.save(newBook);
        }).orElseGet(()->{newBook.setBookId(id);
            return bookRepository.save(newBook);
        });
    }
}