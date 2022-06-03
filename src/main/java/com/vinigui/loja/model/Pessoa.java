package com.vinigui.loja.model;

import com.vinigui.loja.dto.PessoaDTO;
import lombok.*;

@EqualsAndHashCode
@Builder
public abstract class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa() {}

    public Pessoa(PessoaDTO pessoaDTO) {
        this.nome = pessoaDTO.getNome();
        this.cpf = pessoaDTO.getCpf();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
