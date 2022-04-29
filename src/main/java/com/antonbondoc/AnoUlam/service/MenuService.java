package com.antonbondoc.AnoUlam.service;

import com.antonbondoc.AnoUlam.entity.Menu;
import com.antonbondoc.AnoUlam.repository.MenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getMenu(String restaurantName) {
        log.info("Getting all available menu items");
        return menuRepository.findAll();
    }
}
