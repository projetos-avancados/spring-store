package com.vinigui.loja.dto;

import com.vinigui.loja.model.Cliente;

public class ClienteDTO extends PessoaDTO{
    private Long id;
    private EnderecoDTO enderecoDTO;

    public ClienteDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO) {
        super(nome, cpf);
        this.id = id;
        this.enderecoDTO = enderecoDTO;
    }

    public ClienteDTO() {}

    public ClienteDTO(Cliente cliente){
        super(cliente.getNome(), cliente.getCpf());
        this.id = cliente.getId();
        this.enderecoDTO = new EnderecoDTO(cliente.getEndereco());
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
}
