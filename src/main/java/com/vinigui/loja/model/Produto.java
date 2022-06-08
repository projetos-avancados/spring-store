package com.vinigui.loja.model;

import com.vinigui.loja.dto.ProdutoDTO;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@EqualsAndHashCode
public class Produto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;


    public Produto() {}

    public Produto(Long id, String nome, String descricao, BigDecimal preco, Integer quantidade, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.departamento = departamento;
    }

    public Produto(ProdutoDTO produtoDTO){
        this.id = produtoDTO.getId();
        this.nome = produtoDTO.getNome();
        this.descricao = produtoDTO.getDescricao();
        this.quantidade = produtoDTO.getQuantidade();
        this.departamento = new Departamento(produtoDTO.getDepartamento());
    }

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return this.preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }






}
