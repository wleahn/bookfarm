package com.apps.bookfarm.Book;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException (Long id){
        super("Error. Could not find book with id: " + id);
    }
}