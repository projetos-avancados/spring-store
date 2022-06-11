package com.vinigui.loja.dto;

import com.vinigui.loja.model.Cliente;

public class ClienteDTO {
    private Long id;
    private EnderecoDTO enderecoDTO;
    private InformacoesPessoaisDTO informacoesPessoaisDTO;

    public ClienteDTO() {}

    public ClienteDTO(Long id, InformacoesPessoaisDTO informacoesPessoaisDTO, EnderecoDTO enderecoDTO) {
        this.id = id;
        this.informacoesPessoaisDTO = informacoesPessoaisDTO;
        this.enderecoDTO = enderecoDTO;
    }

    public ClienteDTO(Cliente cliente){
        this.id = cliente.getId();
        this.enderecoDTO = new EnderecoDTO(cliente.getEndereco());
        this.informacoesPessoaisDTO = new InformacoesPessoaisDTO(cliente.getInformacoesPessoais());
    }

    public Long getId() {
        return id;
    }

    public EnderecoDTO getEnderecoDTO() {
        return enderecoDTO;
    }

    public void setEnderecoDTO(EnderecoDTO enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    public InformacoesPessoaisDTO getInformacoesPessoaisDTO(){
        return this.informacoesPessoaisDTO;
    }
}
