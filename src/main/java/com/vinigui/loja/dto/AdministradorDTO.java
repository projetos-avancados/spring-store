package com.vinigui.loja.dto;

import com.vinigui.loja.model.Administrador;

public class AdministradorDTO {
    private Long id;
    private InformacoesPessoaisDTO informacoesPessoaisDTO;

    public AdministradorDTO () {}

    public AdministradorDTO(Long id, InformacoesPessoaisDTO informacoesPessoaisDTO) {
        this.id = id;
        this.informacoesPessoaisDTO = informacoesPessoaisDTO;
    }

    public AdministradorDTO (Administrador administrador) {
        this.id = administrador.getId();
        this.informacoesPessoaisDTO = new InformacoesPessoaisDTO(administrador.getInformacoesPessoais());
    }

    public Long getId() {
        return id;
    }

    public InformacoesPessoaisDTO getInformacoesPessoaisDTO() {
        return informacoesPessoaisDTO;
    }
}
