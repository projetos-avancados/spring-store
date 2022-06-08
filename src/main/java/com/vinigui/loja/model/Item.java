package com.vinigui.loja.model;

import com.vinigui.loja.dto.ItemDTO;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@EqualsAndHashCode
public class Item {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @OneToOne
    private Produto produto;
    private Integer quantidade;

    public Item() {}

    public Item(Long id, Produto produto, Integer quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Item(ItemDTO itemDTO) {
        this.id = itemDTO.getId();
        this.produto = new Produto(itemDTO.getProduto());
        this.quantidade = itemDTO.getQuantidade();
    }

    public Long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
