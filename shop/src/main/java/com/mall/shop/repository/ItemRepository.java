package com.mall.shop.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mall.shop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}


