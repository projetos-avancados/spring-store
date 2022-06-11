package com.vinigui.loja.dto;

import com.vinigui.loja.model.InformacoesPessoais;

public class InformacoesPessoaisDTO {
    private Long id;
    private String nome;
    private String cpf;

    public InformacoesPessoaisDTO() {}

    public InformacoesPessoaisDTO(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public InformacoesPessoaisDTO(InformacoesPessoais informacoesPessoais) {
        this.id = informacoesPessoais.getId();
        this.nome = informacoesPessoais.getNome();
        this.cpf = informacoesPessoais.getCpf();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }



}
