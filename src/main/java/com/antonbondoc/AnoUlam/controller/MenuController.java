package com.antonbondoc.AnoUlam.controller;

import com.antonbondoc.AnoUlam.service.MenuService;
import com.antonbondoc.AnoUlam.service.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequestMapping(path = "/restaurant/")
public class MenuController {
    private final MenuService menuService;
    private final RestaurantService restaurantService;

    public MenuController(MenuService menuService,
                          RestaurantService restaurantService) {
        this.menuService = menuService;
        this.restaurantService = restaurantService;
    }

    @GetMapping(path = "{restaurantName}")
    public ModelAndView getSpecificRestaurant(@PathVariable("restaurantName") String restaurantName) {
        log.info("The restaurant name is " + restaurantName);
        ModelAndView mav = new ModelAndView("restaurant/restaurant");
        mav.addObject("restaurant", restaurantService.getSpecificRestaurant(restaurantName));
        mav.addObject("menu", menuService.getMenu(restaurantName));
        return mav;
    }
}
