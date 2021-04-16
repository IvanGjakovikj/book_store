package emt.lab2.com.demo.service;

import emt.lab2.com.demo.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService
{
    void deleteCountryById(Long id);
    List<Country> listAll();
    List<Country> listByCountryName(String name);
    Optional<Country> listById(Long id);
}
