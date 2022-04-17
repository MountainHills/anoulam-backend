package com.antonbondoc.AnoUlam.controller;

import com.antonbondoc.AnoUlam.service.RestaurantService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class RestaurantController {
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping(value = {"/", "/index", "/home"})
    public ModelAndView getRestaurants() {
        ModelAndView mav = new ModelAndView("index");

        // Gets the list of restaurants.
        mav.addObject("restaurants", restaurantService.getRestaurants());
        
        log.info("Received all the restaurants");
        return mav;
    }
}
