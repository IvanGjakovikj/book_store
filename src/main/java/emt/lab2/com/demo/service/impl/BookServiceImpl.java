package emt.lab2.com.demo.service.impl;

import emt.lab2.com.demo.model.Author;
import emt.lab2.com.demo.model.Book;
import emt.lab2.com.demo.repository.JpaBooksRepository;
import emt.lab2.com.demo.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService
{
    private final JpaBooksRepository jpaBooksRepository;

    public BookServiceImpl(JpaBooksRepository jpaBooksRepository)
    {
        this.jpaBooksRepository = jpaBooksRepository;
    }


    @Override
    public void deleteBookById(Long id)
    {
        this.jpaBooksRepository.deleteById(id);
    }

    @Override
    public Optional<Book> findByBookId(Long id)
    {
        return jpaBooksRepository.findByBookId(id);
    }

    @Override
    public List<Book> listBooksAuthor(Author a)
    {
        return jpaBooksRepository.findByAuthor(a);
    }

    @Override
    public List<Book> listBooksAndAuthor(Long id, Author a)
    {
        return jpaBooksRepository.findByBookIdAndAuthor(id, a);
    }
}
