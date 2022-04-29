package com.antonbondoc.AnoUlam.config;

import com.antonbondoc.AnoUlam.entity.Menu;
import com.antonbondoc.AnoUlam.entity.Restaurant;
import com.antonbondoc.AnoUlam.repository.MenuRepository;
import com.antonbondoc.AnoUlam.repository.RestaurantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ApplicationConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            MenuRepository menuRepository,
            RestaurantRepository restaurantRepository
    ) {
        return args -> {
            // Menu Configuration for initial data.
            Menu burger1 = Menu.builder()
                    .name("Hamburger with Fries")
                    .price("P150")
                    .imagePath("/img/burger.jpg")
                    .build();

            Menu burger2 = Menu.builder()
                    .name("Beef Pares with Fried Rice")
                    .price("P170")
                    .imagePath("/img/burger.jpg")
                    .build();

            Menu burger3 = Menu.builder()
                    .name("Dinakdakan")
                    .price("P70")
                    .imagePath("/img/burger.jpg")
                    .build();

            menuRepository.saveAll(
                    List.of(burger1, burger2, burger3)
            );

            // Restaurant Configuration for initial data.
            List<String> keypoint = new ArrayList<>();
            keypoint.add("This is a sample keypoint");

            Restaurant kennyRosie = Restaurant.builder()
                    .name("Kenny Rosie Eatery")
                    .priceRange("P70-P100")
                    .imagePath("/img/restaurants/restaurant1.jpg")
                    .description("This is a sample description that's supposed to be long as fuck.")
                    .build();

            Restaurant test = Restaurant.builder()
                    .name("Test Restaurant No. 2")
                    .priceRange("P70-P100")
                    .imagePath("/img/restaurants/restaurant2.jpg")
                    .description("This is a sample description that's supposed to be long as fuck.")
                    .build();

            Restaurant anderson = Restaurant.builder()
                    .name("Anderson's Diner")
                    .priceRange("P70-P100")
                    .imagePath("/img/restaurants/restaurant3.jpg")
                    .description("This is a sample description that's supposed to be long as fuck.")
                    .build();

            Restaurant kfc = Restaurant.builder()
                    .name("Kentucky Fried Chicken")
                    .priceRange("P70-P100")
                    .imagePath("/img/restaurants/restaurant4.jpg")
                    .description("This is a sample description that's supposed to be long as fuck.")
                    .build();

            Restaurant kennyRoger = Restaurant.builder()
                    .name("Kenny Roger's Roasters")
                    .priceRange("P70-P100")
                    .imagePath("/img/restaurants/restaurant5.jpg")
                    .description("This is a sample description that's supposed to be long as fuck.")
                    .build();

            Restaurant jollibee = Restaurant.builder()
                    .name("Jollibee")
                    .priceRange("P70-P100")
                    .imagePath("/img/restaurants/restaurant6.jpg")
                    .description("This is a sample description that's supposed to be long as fuck.")
                    .build();

            restaurantRepository.saveAll(
                    List.of(kennyRosie, test, anderson, kfc, kennyRoger, jollibee)
            );
        };
    }
}
