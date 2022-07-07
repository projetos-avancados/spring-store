package com.vinigui.loja.dto;

import com.vinigui.loja.model.InformacoesPessoais;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformacoesPessoaisDTO that = (InformacoesPessoaisDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf);
    }
}
