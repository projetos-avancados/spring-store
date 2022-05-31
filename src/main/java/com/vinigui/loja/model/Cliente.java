package com.vinigui.loja.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Builder
@EqualsAndHashCode
public class Cliente extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Cliente(String nome, String cpf, Long id, Endereco endereco) {
        super(nome, cpf);
        this.id = id;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente() {

    }
}
