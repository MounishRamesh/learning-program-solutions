

package com.example.service;

import com.example.repository.BookRepository;

public class LibraryService {
    private BookRepository bookRepository;

    // Constructor Injection
    public LibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        bookRepository.getBook();
    }
}
