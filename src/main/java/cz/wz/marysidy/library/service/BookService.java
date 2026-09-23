package cz.wz.marysidy.library.service;

import cz.wz.marysidy.library.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//@Slf4j
@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookService.class);

    public Book getBookById(Long id) {
        log.info("getBookById({}) method started ...", id);

        Book book = new Book(1L, "Pushkin", "Title");

        log.info("getBookById({}) method finished.", id);
        return book;
    }
}
