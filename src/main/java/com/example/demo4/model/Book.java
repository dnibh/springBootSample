package com.example.demo4.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    public Integer Id;

    public String Title;


}
