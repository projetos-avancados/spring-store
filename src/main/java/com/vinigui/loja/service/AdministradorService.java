package com.vinigui.loja.service;

import com.vinigui.loja.dto.AdministradorDTO;
import com.vinigui.loja.exception.NotFoundException;
import com.vinigui.loja.model.Administrador;
import com.vinigui.loja.repository.AdministradorRepository;
import org.springframework.stereotype.Service;

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

}
