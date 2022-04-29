package com.antonbondoc.AnoUlam.service;

import com.antonbondoc.AnoUlam.entity.Restaurant;
import com.antonbondoc.AnoUlam.repository.RestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant getSpecificRestaurant(String restaurantName) {
        log.info("Getting restaurant info of: [" + restaurantName + "]");
        return restaurantRepository.findRestaurantByName(restaurantName);
    }

    public List<Restaurant> getRestaurants() {
        log.info("Getting all available restaurants");
        return restaurantRepository.findAll();
    }
}
