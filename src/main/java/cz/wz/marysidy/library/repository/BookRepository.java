package cz.wz.marysidy.library.repository;

import cz.wz.marysidy.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
