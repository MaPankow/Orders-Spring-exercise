package com.example.orders2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "_order") //orders könnte für irgendwas anderes als Keyword reserviert sein und deswegen zu Missverständnissen führen
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private int quantity;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // public Customer getCustomer() {
    //     return customer;
    // } Rekursion

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
