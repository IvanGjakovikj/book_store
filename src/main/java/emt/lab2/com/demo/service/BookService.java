package emt.lab2.com.demo.service;

import emt.lab2.com.demo.model.Author;
import emt.lab2.com.demo.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService
{
    void deleteBookById(Long id);
    Optional<Book> findByBookId(Long id);
    List<Book> listBooksAuthor(Author a);
    List<Book> listBooksAndAuthor(Long id, Author a);
}
