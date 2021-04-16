package emt.lab2.com.demo.service;

import emt.lab2.com.demo.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService
{
    void deleteId(Long id);
    Optional<Author> listByAuthorId(Long id);
    List<Author> listByName(String name);
}
