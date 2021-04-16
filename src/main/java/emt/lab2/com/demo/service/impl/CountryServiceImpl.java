package emt.lab2.com.demo.service.impl;

import emt.lab2.com.demo.model.Country;
import emt.lab2.com.demo.repository.JpaCountryRepository;
import emt.lab2.com.demo.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService
{
    private final JpaCountryRepository jpaCountryRepository;

    public CountryServiceImpl(JpaCountryRepository jpaCountryRepository)
    {
        this.jpaCountryRepository = jpaCountryRepository;
    }


    @Override
    public void deleteCountryById(Long id)
    {
        this.jpaCountryRepository.deleteById(id);
    }

    @Override
    public List<Country> listAll()
    {
        return jpaCountryRepository.findAll();
    }

    @Override
    public List<Country> listByCountryName(String name)
    {
        return jpaCountryRepository.findByName(name);
    }

    @Override
    public Optional<Country> listById(Long id)
    {
        return jpaCountryRepository.findById(id);
    }
}
