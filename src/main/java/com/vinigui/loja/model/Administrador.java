package com.vinigui.loja.model;

import com.vinigui.loja.dto.AdministradorDTO;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Builder
@EqualsAndHashCode
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private InformacoesPessoais informacoesPessoais;


    public Administrador() {}

    public Administrador(Long id, InformacoesPessoais informacoesPessoais) {
        this.id = id;
        this.informacoesPessoais = informacoesPessoais;
    }

    public Administrador(AdministradorDTO administradorDTO) {
        this.id = administradorDTO.getId();
        this.informacoesPessoais = new InformacoesPessoais(administradorDTO.getInformacoesPessoaisDTO());
    }
    public Long getId() {
        return id;
    }

    public InformacoesPessoais getInformacoesPessoais() {
        return informacoesPessoais;
    }


}
