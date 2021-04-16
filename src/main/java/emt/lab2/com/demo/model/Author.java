package emt.lab2.com.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Author
{

    private Long id;
    private String name;
    private String surname;
    private Country country;

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
