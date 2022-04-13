package com.antonbondoc.AnoUlam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private long id;
    private String name;
    private String priceRange;
    private String imagePath;
    private String description;
    private List<String> keypoint;

    public Restaurant(String name, String priceRange, String imagePath, String description, List<String> keypoint) {
        this.name = name;
        this.priceRange = priceRange;
        this.imagePath = imagePath;
        this.description = description;
        this.keypoint = keypoint;
    }
}
