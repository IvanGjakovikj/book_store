package emt.lab2.com.demo.repository;

import emt.lab2.com.demo.model.Author;
import emt.lab2.com.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JpaBooksRepository extends JpaRepository<Book, Long>
{
    void deleteById(Long id);
    Optional<Book> findByBookId(Long id);
    List<Book> findByAuthor(Author a);
    List<Book> findByBookIdAndAuthor(Long id, Author a);
}
