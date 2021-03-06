package com.vinigui.loja.service;

import com.vinigui.loja.dto.AdministradorDTO;
import com.vinigui.loja.exception.NotFoundException;
import com.vinigui.loja.model.Administrador;
import com.vinigui.loja.repository.AdministradorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
