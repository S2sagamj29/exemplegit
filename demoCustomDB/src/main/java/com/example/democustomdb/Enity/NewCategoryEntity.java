package com.example.democustomdb.Enity;

import javax.persistence.*;

@Entity
@Table(name = "category_entity")
public class NewCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCategory;

    @Column
    private String category;

    @Column
    private String price;

    @Column
    private String decreption;


    public Long getIdCategory() {
        return IdCategory;
    }

    public void setIdCategory(Long idCategory) {
        IdCategory = idCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDecreption() {
        return decreption;
    }

    public void setDecreption(String decreption) {
        this.decreption = decreption;
    }
}
