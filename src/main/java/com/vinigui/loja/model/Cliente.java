package com.vinigui.loja.model;

import com.vinigui.loja.dto.ClienteDTO;
import com.vinigui.loja.dto.InformacoesPessoaisDTO;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Builder
@EqualsAndHashCode

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToOne
    private InformacoesPessoais informacoesPessoais;

    public Cliente() {}

    public Cliente(Long id, Endereco endereco, InformacoesPessoais informacoesPessoais) {
        this.id = id;
        this.endereco = endereco;
        this.informacoesPessoais = informacoesPessoais;
    }

    public Cliente(ClienteDTO clienteDTO){
        this.id = clienteDTO.getId();
        this.endereco = new Endereco(clienteDTO.getEnderecoDTO());
        this.informacoesPessoais = new InformacoesPessoais(clienteDTO.getInformacoesPessoaisDTO());
    }

    public Long getId() {
        return id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public InformacoesPessoais getInformacoesPessoais() {
        return this.informacoesPessoais;
    }




}
