package com.antonbondoc.AnoUlam.repository;

import com.antonbondoc.AnoUlam.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    @Query("SELECT r FROM Restaurant r WHERE r.name = ?1")
    Restaurant findRestaurantByName(String restaurantName);
}
