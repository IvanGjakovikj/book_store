package emt.lab2.com.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class Book
{

    private Long id;
    private String name;
    private Author author;
    private int availableCopies;



    public void setId(Long id)
    {
        this.id = id;
    }

    @Id
    public Long getId()
    {
        return id;
    }
}
