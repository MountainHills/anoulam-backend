package com.antonbondoc.AnoUlam.controller;

import com.antonbondoc.AnoUlam.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/restaurant/")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping(path = "{restaurant-name}")
    public ModelAndView getMenu(@PathVariable("restaurant-name") String restaurant) {
        ModelAndView mav = new ModelAndView("test");
        System.out.println(restaurant);
        mav.addObject("restaurantName", restaurant);
        mav.addObject("menu", menuService.getMenu());
        return mav;
    }
}
