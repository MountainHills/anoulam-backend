package com.antonbondoc.AnoUlam.service;

import com.antonbondoc.AnoUlam.entity.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    public List<Restaurant> getRestaurants() {
        List<String> sampleList = new ArrayList<>();
        sampleList.add("This is a keypoint");
        return List.of(
                new Restaurant("Anton Restaurant",
                        "P40-P50",
                        "/img/img.jpg",
                        "Nice one!",
                        sampleList)
        );
    }
}
