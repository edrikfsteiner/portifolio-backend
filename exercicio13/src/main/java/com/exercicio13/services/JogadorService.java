package com.exercicio13.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicio13.dto.JogadorDTO;
import com.exercicio13.mappers.JogadorMapper;
import com.exercicio13.model.Jogador;
import com.exercicio13.repository.JogadorRepository;

import java.util.List;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository repository;

    public List<JogadorDTO> listarJogadores() {
        return repository.findAll().stream()
            .map(JogadorMapper::toDTO)
            .toList();
    }

    public JogadorDTO criarJogador(JogadorDTO jogadorDTO) {
        Jogador jogador = JogadorMapper.toEntity(jogadorDTO);
        jogador = repository.save(jogador);
        return JogadorMapper.toDTO(jogador);
    }
}