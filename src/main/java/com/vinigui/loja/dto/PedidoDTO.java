package com.vinigui.loja.dto;

import com.vinigui.loja.model.Item;
import com.vinigui.loja.model.Pedido;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

public class PedidoDTO {

    private Long id;
    private List<Item> itens;
    private LocalDateTime dataHoraDoPedido;

    public PedidoDTO() {
    }

    public PedidoDTO(Long id, List<Item> itens, LocalDateTime dataHoraDoPedido) {
        this.id = id;
        this.itens = itens;
        this.dataHoraDoPedido = dataHoraDoPedido;
    }

    public PedidoDTO(Pedido pedido){
        this.id = pedido.getId();
        this.itens = pedido.getItens();
        this.dataHoraDoPedido = pedido.getDataHoraDoPedido();
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

    public LocalDateTime getDataHoraDoPedido() {
        return dataHoraDoPedido;
    }

    public void setDataHoraDoPedido(LocalDateTime dataHoraDoPedido) {
        this.dataHoraDoPedido = dataHoraDoPedido;
    }
}
