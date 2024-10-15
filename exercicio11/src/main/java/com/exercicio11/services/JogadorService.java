package com.exercicio11.services;

import org.springframework.stereotype.Service;

import com.exercicio11.dto.JogadorRequestDTO;
import com.exercicio11.dto.JogadorResponseDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class JogadorService {
    private final List<JogadorResponseDTO> jogadores = new ArrayList<>();
    private final Random random = new Random();

    public JogadorResponseDTO criarJogador(JogadorRequestDTO request) {
        int habilidade = random.nextInt(101);
        String statusMessage = "Jogador cadastrado com sucesso";

        JogadorResponseDTO jogador = new JogadorResponseDTO(request.nome(), request.apelido(), habilidade, statusMessage);
        jogadores.add(jogador);
        return jogador;
    }

    public List<JogadorResponseDTO> obterTodosJogadores() {
        return new ArrayList<>(jogadores);
    }
}