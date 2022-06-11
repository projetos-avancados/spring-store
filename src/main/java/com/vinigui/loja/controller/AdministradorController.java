package com.vinigui.loja.controller;

import com.vinigui.loja.dto.AdministradorDTO;
import com.vinigui.loja.model.Administrador;
import com.vinigui.loja.service.AdministradorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/administrado")
public class AdministradorController {

    private final AdministradorService administradorService;

    public AdministradorController(AdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    @PostMapping
    public ResponseEntity<AdministradorDTO> salvarAdministrador(@RequestBody @Valid AdministradorDTO administradorDTO) {
        return new ResponseEntity<>(this.administradorService.salvarAdministrador(administradorDTO),HttpStatus.CREATED);
    }
}
