package com.vinigui.loja.repository;

import com.vinigui.loja.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <Item, Long> {
}
