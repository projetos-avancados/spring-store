package com.vinigui.loja.dto;

import com.vinigui.loja.model.Departamento;
import com.vinigui.loja.model.Item;

import java.util.ArrayList;

public class ItemDTO {

    private Long id;
    private ProdutoDTO produto;
    private Integer quantidade;

    public ItemDTO() {
    }

    public ItemDTO(Long id, ProdutoDTO produto, Integer quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }


    public ItemDTO(Item item){
        this.id = item.getId();
        this.produto = new ProdutoDTO(item.getProduto());
        this.quantidade = item.getQuantidade();
    }

    public Long getId() {
        return id;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
