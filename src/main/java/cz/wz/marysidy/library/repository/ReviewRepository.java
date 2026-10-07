package cz.wz.marysidy.library.repository;

import cz.wz.marysidy.library.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
