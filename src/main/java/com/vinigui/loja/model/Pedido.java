package com.vinigui.loja.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Item> itens;
    private LocalDateTime dataHoraDoPedido;

    public Pedido() {}

    public Pedido(Long id, List<Item> itens, LocalDateTime dataHoraDoPedido) {
        this.id = id;
        this.itens = itens;
        this.dataHoraDoPedido = dataHoraDoPedido;
    }

    public Long getId() {
        return id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setDataHoraDoPedido(LocalDateTime dataHoraDoPedido) {
        this.dataHoraDoPedido = dataHoraDoPedido;
    }

    public LocalDateTime getDataHoraDoPedido() {
        return dataHoraDoPedido;
    }
}
