package com.librarymanagementsystem.lms.controller;

import com.librarymanagementsystem.lms.entity.Book;
import com.librarymanagementsystem.lms.service.BookService;
import com.librarymanagementsystem.lms.service.BorrowingDetailsService;
import com.librarymanagementsystem.lms.service.UserRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class BookController {
    @Autowired
    private BookService bookService;


    @PostMapping("/saveBooks")
    public Book createBook(@RequestBody Book book) {

        return bookService.create(book);
    }
    @GetMapping("/getBookByID/{id}")
    public ResponseEntity<Book>getBookByID(@PathVariable Long id){
         return ResponseEntity.ok(bookService.getBookBYID(id));
    }
    @GetMapping("/getAllBooks")
    public ResponseEntity<List<Book>>getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @PutMapping("/updateBookDetails/{id}")
    public ResponseEntity<Object> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) throws Exception {
        return ResponseEntity.ok(bookService.updateBook(id, bookDetails));
    }
    @DeleteMapping("/deleteBookById/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Long id) throws Exception {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

}
