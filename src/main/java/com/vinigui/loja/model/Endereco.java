package com.vinigui.loja.model;


import com.vinigui.loja.dto.EnderecoDTO;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@EqualsAndHashCode
@Entity
public class Endereco {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private Integer numero;
    private String cep;


    public Endereco(Long id, String rua, String bairro, String cidade, String estado, Integer numero, String cep) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
    }

    public Endereco() {
    }

    public Endereco(EnderecoDTO enderecoDTO){
        this.id = enderecoDTO.getId();
        this.rua = enderecoDTO.getRua();
        this.bairro = enderecoDTO.getBairro();
        this.cidade = getCidade();
        this.estado = getEstado();
        this.numero = getNumero();
        this.cep = getCep();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
