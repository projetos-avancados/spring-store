package com.vinigui.loja.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vinigui.loja.model.Administrador;

import java.util.Objects;

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

    public void setInformacoesPessoaisDTO(InformacoesPessoaisDTO informacoesPessoaisDTO) {
        this.informacoesPessoaisDTO = informacoesPessoaisDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministradorDTO that = (AdministradorDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(informacoesPessoaisDTO, that.informacoesPessoaisDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, informacoesPessoaisDTO);
    }
}
