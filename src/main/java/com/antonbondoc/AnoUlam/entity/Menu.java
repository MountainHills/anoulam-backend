package com.antonbondoc.AnoUlam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private long id;
    private String name;
    private String priceRange;
    private String imagePath;

    public Menu(String name, String priceRange, String imagePath) {
        this.name = name;
        this.priceRange = priceRange;
        this.imagePath = imagePath;
    }
}
