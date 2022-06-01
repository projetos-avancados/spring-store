package com.vinigui.loja.dto;

import com.vinigui.loja.model.Departamento;

import java.util.List;

public class DepartamentoDTO {
    private Long id;
    private String nome;
    private List<ProdutoDTO> listaDeProdutos;

    public DepartamentoDTO(Long id, String nome, List<ProdutoDTO> listaDeProdutos) {
        this.id = id;
        this.nome = nome;
        this.listaDeProdutos = listaDeProdutos;
    }

    public DepartamentoDTO() {
    }

    public DepartamentoDTO(Departamento departamento) {
        this.id = departamento.getId();
        this.nome = departamento.getNome();
        // TODO: 6/1/2022  
        //Precisa converter a lista de produto para listaDTO
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoDTO> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<ProdutoDTO> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
