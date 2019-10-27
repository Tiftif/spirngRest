package fr.bibliotheque.bibliotheque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRespository extends JpaRepository<Book, Integer> {

    // custom query to search to book post by title or content
    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);
    
}
