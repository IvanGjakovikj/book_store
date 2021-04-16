package emt.lab2.com.demo.service.impl;

import emt.lab2.com.demo.model.Author;
import emt.lab2.com.demo.repository.JpaAuthorRepository;
import emt.lab2.com.demo.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService
{

    private final JpaAuthorRepository jpaAuthorRepository;

    public AuthorServiceImpl(JpaAuthorRepository jpaAuthorRepository)
    {
        this.jpaAuthorRepository = jpaAuthorRepository;
    }

    @Override
    public void deleteId(Long id)
    {
        this.jpaAuthorRepository.deleteById(id);
    }

    @Override
    public Optional<Author> listByAuthorId(Long id)
    {
        return jpaAuthorRepository.findByAuthorId(id);
    }

    @Override
    public List<Author> listByName(String name)
    {
        return jpaAuthorRepository.findByName(name);
    }
}
