package emt.lab2.com.demo.repository;

import emt.lab2.com.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JpaAuthorRepository extends JpaRepository<Author, Long>
{
    void deleteById(Long id);
    Optional<Author> findByAuthorId(Long id);
    List<Author> findByName(String name);
}
