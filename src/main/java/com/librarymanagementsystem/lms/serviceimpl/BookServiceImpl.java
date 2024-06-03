package com.librarymanagementsystem.lms.serviceimpl;

import com.librarymanagementsystem.lms.entity.Book;
import com.librarymanagementsystem.lms.repo.BookRepository;
import com.librarymanagementsystem.lms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return getAllBooks();
    }
    @Override
    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    @Override
    public boolean updateBook(Book book, Long bookId) {
        return false;
    }

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookBYID(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Object updateBook(Long id, Book bookDetails) throws Exception {
        Book b = bookRepository.findById(id).orElseThrow(() -> new Exception("book not found" + id));
        b.setTitle(bookDetails.getTitle());
        b.setAuthor(bookDetails.getAuthor());
        b.setIsbn(bookDetails.getIsbn());
        b.setGenre(bookDetails.getGenre());
        b.setPublisher(bookDetails.getPublisher());
        b.setPublicationYear(bookDetails.getPublicationYear());
        b.setTotalCopies(bookDetails.getTotalCopies());
        b.setAvailableCopies(bookDetails.getAvailableCopies());
        return bookRepository.save(b);
    }

    @Override
    public void deleteBook(Long bookId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow();
        bookRepository.delete(book);
    }
}
