package com.example.democustomdb.DTO;

import javax.persistence.Column;

public class Info {
    private Long id;

    private String category;

    private String price;

    private String decreption;

    private Long IdCategory;

    private String name;

    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getIdCategory() {
        return IdCategory;
    }

    public void setIdCategory(Long idCategory) {
        IdCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
