package com.bookStore.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.io.Serializable;

@Entity
@Table(name = "MyBooks")
public class MyBookList implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String author;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    public MyBookList() {}

    public MyBookList(int id, String name, String author, BigDecimal price) {
        
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
}
