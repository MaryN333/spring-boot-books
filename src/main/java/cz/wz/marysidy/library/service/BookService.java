package cz.wz.marysidy.library.service;

import cz.wz.marysidy.library.entity.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public Book getBookById(Long id) {
        return new Book(id, "Pushkin", "Title");
    }
}
