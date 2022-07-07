package com.vinigui.loja.controller;

import com.vinigui.loja.dto.AdministradorDTO;
import com.vinigui.loja.model.Administrador;
import com.vinigui.loja.service.AdministradorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/administrador")
public class AdministradorController {

    private final AdministradorService administradorService;

    public AdministradorController(AdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    @PostMapping
    public ResponseEntity<AdministradorDTO> salvarAdministrador(@RequestBody @Valid AdministradorDTO administradorDTO) {
        return new ResponseEntity<>(this.administradorService.salvarAdministrador(administradorDTO),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdministradorDTO> listarAdministradores(@PathVariable("id") Long id) {
        return new ResponseEntity<AdministradorDTO>(this.administradorService.buscarAdministrador(id), HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<List<AdministradorDTO>> listarTodosAdministradores(){
        return new ResponseEntity<List<AdministradorDTO>>(this.administradorService.buscarTodosAdministradores(), HttpStatus.ACCEPTED);
    }
}
