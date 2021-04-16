package emt.lab2.com.demo.repository;


import emt.lab2.com.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JpaCountryRepository extends JpaRepository<Country, Long>
{
    void deleteById(Long id);
    List<Country> findAll();
    List<Country> findByName(String name);
    Optional<Country> findById(Long id);
}
