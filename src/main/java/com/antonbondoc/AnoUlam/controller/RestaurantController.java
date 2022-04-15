package com.antonbondoc.AnoUlam.controller;

import com.antonbondoc.AnoUlam.entity.Restaurant;
import com.antonbondoc.AnoUlam.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping(value = {"/", "/index", "/restaurant"})
    public ModelAndView getRestaurants() {
        ModelAndView mav = new ModelAndView("index");

        // Gets the list of restaurants.
        mav.addObject("restaurants", restaurantService.getRestaurants());

        return mav;
    }
}
