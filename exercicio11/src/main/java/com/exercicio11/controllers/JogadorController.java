package com.exercicio11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exercicio11.dto.JogadorRequestDTO;
import com.exercicio11.dto.JogadorResponseDTO;
import com.exercicio11.services.JogadorService;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    private final JogadorService jogadorService;

    @Autowired
    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping
    public List<JogadorResponseDTO> obterTodosJogadores() {
        return jogadorService.obterTodosJogadores();
    }

    @PostMapping
    public JogadorResponseDTO criarJogador(@RequestBody JogadorRequestDTO request) {
        return jogadorService.criarJogador(request);
    }
}