package com.javastudio.tutorial.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
@SequenceGenerator(name = "seq_generator")
public class Product {
    @Id
    @GeneratedValue(generator = "seq_generator", strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(name = "name", length = 100)
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
