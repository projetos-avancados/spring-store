package com.vinigui.loja.dto;

import com.vinigui.loja.model.Pessoa;

public abstract class PessoaDTO {
    private String nome;
    private String cpf;

    public PessoaDTO(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public PessoaDTO() {}

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
