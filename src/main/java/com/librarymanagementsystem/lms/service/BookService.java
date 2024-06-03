package com.librarymanagementsystem.lms.service;

import com.librarymanagementsystem.lms.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    Book addBook(Book book);
    boolean updateBook(Book book, Long bookId);

    Book create(Book book);

    Book getBookBYID(Long id);

    Object updateBook(Long id, Book bookDetails) throws Exception;

    void deleteBook(Long id) throws Exception;
}
