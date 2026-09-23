package cz.wz.marysidy.library.service;

import cz.wz.marysidy.library.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class BookService {

    public Book getBookById(Long id) {
        return new Book(1L, "Pushkin", "Title");
    }
}
