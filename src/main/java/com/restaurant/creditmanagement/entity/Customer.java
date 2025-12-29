package com.restaurant.creditmanagement.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String phoneNumber;

    private String address;

    @Column(nullable = false)
    private double totalCredit=0.0;

    public Customer(){}

    public Customer(long id, String name, String phoneNumber, String address, double totalCredit) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.totalCredit = totalCredit;
    }



}
