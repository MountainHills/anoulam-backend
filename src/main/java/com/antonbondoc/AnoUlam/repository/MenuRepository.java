package com.antonbondoc.AnoUlam.repository;

import com.antonbondoc.AnoUlam.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
