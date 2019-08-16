package io.clouddevlabs.boot.hello;

import io.clouddevlabs.boot.hello.model.Book;
import io.clouddevlabs.boot.hello.repositories.BookRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public Iterable<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{name}")
    public Iterable<Book> getBooksByName(@PathVariable String name) {
        return bookRepository.findByName(name);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
