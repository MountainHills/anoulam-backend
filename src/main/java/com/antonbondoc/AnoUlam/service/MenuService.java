package com.antonbondoc.AnoUlam.service;

import com.antonbondoc.AnoUlam.entity.Menu;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Log4j2
public class MenuService {

    public List<Menu> getMenu(String restaurantName) {

        log.info("Getting the menu of: [" + restaurantName + "]");

        return Arrays.asList(
                new Menu("Hamburger with Fries",
                        "P80",
                        "/img/burger.jpg"),
                new Menu("Beef Steak with Fried Rice",
                        "P100",
                        "/img/burger.jpg"),
                new Menu("Beef Pares with Fried Rice",
                        "P120",
                        "/img/burger.jpg"),
                new Menu("Hot Mami",
                        "P40",
                        "/img/burger.jpg"),
                new Menu("Siomai Rice",
                        "P40",
                        "/img/burger.jpg"),
                new Menu("Dinakdakan",
                        "P80",
                        "/img/burger.jpg")
        );
    }
}
