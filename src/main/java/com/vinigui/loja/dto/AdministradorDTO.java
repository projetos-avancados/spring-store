package com.vinigui.loja.dto;

import com.vinigui.loja.model.Administrador;

public class AdministradorDTO extends PessoaDTO{
    private Long id;

    public AdministradorDTO(Long id, String nome, String cpf) {
        super(nome, cpf);
        this.id = id;
    }

    public AdministradorDTO () {}

    public AdministradorDTO (Administrador administrador) {
        super(administrador.getNome(), administrador.getCpf());
        this.id = administrador.getId();
    }

    public Long getId() {
        return id;
    }

}
