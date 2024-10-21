package com.exercicio13.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exercicio13.dto.JogadorDTO;
import com.exercicio13.services.JogadorService;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorService service;

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> listarJogadores() {
        List<JogadorDTO> jogadores = service.listarJogadores();
        return ResponseEntity.ok(jogadores);
    }

    @PostMapping
    public ResponseEntity<JogadorDTO> criarJogador(@Valid @RequestBody JogadorDTO jogadorDTO) {
        JogadorDTO criado = service.criarJogador(jogadorDTO);
        return ResponseEntity.ok(criado);
    }
}