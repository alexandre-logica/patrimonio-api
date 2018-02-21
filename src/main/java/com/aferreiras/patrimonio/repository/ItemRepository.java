package com.aferreiras.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aferreiras.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
