package com.vinigui.loja.model;

import com.vinigui.loja.dto.InformacoesPessoaisDTO;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "informacoes_pessoais")
public class InformacoesPessoais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;

    public InformacoesPessoais() {}
    
    public InformacoesPessoais(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public InformacoesPessoais(InformacoesPessoaisDTO informacoesPessoaisDTO) {
        this.nome = informacoesPessoaisDTO.getNome();
        this.cpf = informacoesPessoaisDTO.getCpf();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
