package com.exercicio12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exercicio12.dto.ContaDTO;
import com.exercicio12.dto.TransacaoRequestDTO;
import com.exercicio12.dto.TransacaoResponseDTO;
import com.exercicio12.services.TransacoesService;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    private final TransacoesService transacoesService;

    @Autowired
    public TransacaoController(TransacoesService transacoesService) {
        this.transacoesService = transacoesService;
    }

    @GetMapping("/contas")
    public List<ContaDTO> listarContas() {
        return transacoesService.listarContas();
    }

    @PostMapping
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        return transacoesService.gerarTransacao(request);
    }
}