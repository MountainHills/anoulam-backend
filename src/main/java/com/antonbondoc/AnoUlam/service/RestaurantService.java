package com.antonbondoc.AnoUlam.service;

import com.antonbondoc.AnoUlam.entity.Restaurant;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class RestaurantService {

    public List<Restaurant> getRestaurants() {
        List<String> sampleList = new ArrayList<>();
        sampleList.add("This is a keypoint");

        log.info("Getting all the available restaurants");
        return List.of(
                new Restaurant("Kenny Rosie Eatery",
                        "P70-P100",
                        "/img/restaurants/restaurant1.jpg",
                        "This is a description that I wish to change in the future.",
                        sampleList),

                new Restaurant("Q&A Canteen",
                        "P40-P50",
                        "/img/restaurants/restaurant2.jpg",
                        "Nice one!",
                        sampleList),

                new Restaurant("Anderson's Diner",
                        "P40-P50",
                        "/img/restaurants/restaurant3.jpg",
                        "Nice one!",
                        sampleList),

                new Restaurant("Guinness Cuisine",
                        "P40-P50",
                        "/img/restaurants/restaurant4.jpg",
                        "Nice one!",
                        sampleList),

                new Restaurant("Mang Bark's Chicken",
                        "P40-P50",
                        "/img/restaurants/restaurant5.jpg",
                        "Nice one!",
                        sampleList),

                new Restaurant("Gong Cha Milk Tea",
                        "P40-P50",
                        "/img/restaurants/restaurant6.jpg",
                        "Nice one!",
                        sampleList)
        );
    }

    public Restaurant getSpecificRestaurant(String name) {
        List<String> sampleList = new ArrayList<>();
        sampleList.add("This is a keypoint");
        sampleList.add("This is another random keypoint");
        sampleList.add("I wonder how many keypoints would break this list");

        log.info("Getting specific restaurant details of: [" + name + "]");

        return new Restaurant("Kenny Rosie Eatery",
                "P70-P100",
                "/img/restaurants/restaurant1.jpg",
                "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Earum odio omnis eos" +
                        "ex labore illo commodi maxime nemo ipsa aliquid?",
                sampleList);
    }
}
