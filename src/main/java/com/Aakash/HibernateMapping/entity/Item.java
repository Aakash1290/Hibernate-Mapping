package com.Aakash.HibernateMapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Item(String name) { // Constructor without ID
        this.name = name;
    }

//    @OneToOne(cascade = CascadeType.ALL,mappedBy = "item")
//    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL,mappedBy="customer")
    private List<Customer> customers = new ArrayList<>();



}
