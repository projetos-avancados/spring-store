package com.vinigui.loja.service;

import com.vinigui.loja.dto.AdministradorDTO;
import com.vinigui.loja.dto.InformacoesPessoaisDTO;
import com.vinigui.loja.model.Administrador;
import com.vinigui.loja.model.InformacoesPessoais;
import com.vinigui.loja.repository.AdministradorRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AdministradorServiceTeste {

    @Mock
    private AdministradorRepository administradorRepository;

    @InjectMocks
    private AdministradorService administradorService;

    @Test
    @DisplayName("Deve inserir um administrador")
    void deveInserirUmAdministrador() {
        AdministradorDTO administradorDTO = new AdministradorDTO(1L, new InformacoesPessoaisDTO("Joao", "12345678910"));
        Administrador administrador = new Administrador(1L, new InformacoesPessoais("Joao", "12345678910"));
        when(administradorRepository.save(any())).thenReturn(administrador);
        assertEquals(administradorDTO, administradorService.salvarAdministrador(new AdministradorDTO(administrador)));
    }


    @Test
    @DisplayName("Deve buscar um administrador")
    void deveBuscarUmAdministrador() {
        AdministradorDTO administradorDTO = new AdministradorDTO(1L, new InformacoesPessoaisDTO("Joao", "12345678910"));
        Administrador administrador = new Administrador(1L, new InformacoesPessoais("Joao", "12345678910"));
        when(administradorRepository.findById(1L)).thenReturn(Optional.of(administrador));
        assertEquals(administradorDTO, administradorService.buscarAdministrador(1L));
    }


}
