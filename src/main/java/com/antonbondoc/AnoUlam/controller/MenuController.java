package com.antonbondoc.AnoUlam.controller;

import com.antonbondoc.AnoUlam.service.MenuService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
@RequestMapping(path = "/restaurant/")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping(path = "{restaurantName}")
    public ModelAndView getSpecificRestaurant(@PathVariable("restaurantName") String restaurantName) {
        log.info("The restaurant name is " + restaurantName);
        ModelAndView mav = new ModelAndView("restaurant/restaurant");
        return mav;
    }
}
