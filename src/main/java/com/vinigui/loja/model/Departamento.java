package com.vinigui.loja.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@EqualsAndHashCode
public class Departamento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;

    @OneToMany
    private List<Produto> listaDeProdutos;

    public Departamento() {}

    public Departamento(Long id, String nome, List<Produto> listaDeProdutos) {
        this.id = id;
        this.nome = nome;
        this.listaDeProdutos = listaDeProdutos;
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

    public List<Produto> getListaDeProdutos() {
        return this.listaDeProdutos;
    }

    public void setListaDeProdutos(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }


}
