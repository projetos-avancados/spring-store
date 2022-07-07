package com.vinigui.loja.model;

import com.vinigui.loja.dto.PedidoDTO;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@EqualsAndHashCode
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

    public Pedido(PedidoDTO pedidoDTO) {
        this.id = pedidoDTO.getId();
        this.itens = pedidoDTO.getItens();
        this.dataHoraDoPedido = pedidoDTO.getDataHoraDoPedido();
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
