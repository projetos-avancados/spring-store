package com.vinigui.loja.model;

import com.vinigui.loja.dto.AdministradorDTO;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@EqualsAndHashCode
public class Administrador extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Administrador(Long id, String nome, String cpf) {
        super(nome, cpf);
        this.id = id;
    }

    public Administrador() {}

    public Administrador(AdministradorDTO administradorDTO) {
        super(administradorDTO.getNome(), administradorDTO.getCpf());
        this.id = administradorDTO.getId();
    }
    public Long getId() {
        return id;
    }
}
