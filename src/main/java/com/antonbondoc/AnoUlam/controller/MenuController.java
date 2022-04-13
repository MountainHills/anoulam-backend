package com.antonbondoc.AnoUlam.controller;

import com.antonbondoc.AnoUlam.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public String getMenu() {
        return menuService.getMenu();
    }
}
