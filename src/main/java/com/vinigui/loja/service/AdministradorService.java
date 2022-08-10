package com.vinigui.loja.service;

import com.vinigui.loja.dto.AdministradorDTO;
import com.vinigui.loja.dto.InformacoesPessoaisDTO;
import com.vinigui.loja.exception.NotFoundException;
import com.vinigui.loja.model.Administrador;
import com.vinigui.loja.model.InformacoesPessoais;
import com.vinigui.loja.repository.AdministradorRepository;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Objects.requireNonNullElse;

@Service
public class AdministradorService {
    private final AdministradorRepository administradorRepository;

    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }

    public AdministradorDTO buscarAdministrador(Long id) {
        Optional<Administrador> administrador = administradorRepository.findById(id);
        if(administrador.isEmpty()) {
            throw new NotFoundException("Este administrador nao existe");
        }
        return new AdministradorDTO(administrador.get());
    }

    public AdministradorDTO salvarAdministrador(AdministradorDTO administradorDTO) {
        Administrador administrador = new Administrador(administradorDTO);
        return new AdministradorDTO(administradorRepository.save(administrador));
    }

    public void excluirAdministrador(Long id) {
        Optional<Administrador> administrador = administradorRepository.findById(id);
        if(administrador.isEmpty()) {
            throw new NotFoundException("Este administrador nao existe");
        }
         administradorRepository.deleteById(id);
    }

    public AdministradorDTO alterarAdministrador(@Valid AdministradorDTO administradorDTO) {
        Optional<Administrador> administrador = administradorRepository.findById(administradorDTO.getId());
        if(administrador.isEmpty()) {
            throw new NotFoundException("Este administrador nao existe");
        }
        Administrador admin = administrador.get();
        admin.setInformacoesPessoais(requireNonNullElse(new InformacoesPessoais(administradorDTO.getInformacoesPessoaisDTO()), admin.getInformacoesPessoais()));


        return new AdministradorDTO(administradorRepository.save(admin));
    }


    public List<AdministradorDTO> buscarTodosAdministradores() {
        List<Administrador> listaDeAdministrador = administradorRepository.findAll();
        List<AdministradorDTO> listaDeAdmnistradorDTO = new ArrayList<>();
        listaDeAdministrador.forEach(adm -> {
            AdministradorDTO admDTO = new AdministradorDTO(adm);
            listaDeAdmnistradorDTO.add(admDTO);
        });
        return listaDeAdmnistradorDTO;
    }
}
