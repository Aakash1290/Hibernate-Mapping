package com.Aakash.HibernateMapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;

  //1//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_item")            //if we want seprate table and we wont define in inverse side bcoz we defined here
//@OneToOne(cascade = CascadeType.ALL)
//    @JoinTable(name ="customer_item",
//            joinColumns = { @JoinColumn(name = "customer_id")},
//            inverseJoinColumns = { @JoinColumn(name = "item_id") })
   // private Item item;


//    2...--->>>  oneToMany

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "customer_item")
//    private List<Item> items = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="customer_item",
            joinColumns = { @JoinColumn(name = "customer_id")},
            inverseJoinColumns = { @JoinColumn(name = "item_id") })
    private Set<Item> items = new HashSet<>();

    public Customer(String name) {
        this.name = name;
    }

}
