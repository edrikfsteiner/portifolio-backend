package com.exercicio12.services;

import org.springframework.stereotype.Service;

import com.exercicio12.dto.ContaDTO;
import com.exercicio12.dto.TransacaoRequestDTO;
import com.exercicio12.dto.TransacaoResponseDTO;
import com.exercicio12.mappers.ContaMapper;
import com.exercicio12.model.Conta;
import com.exercicio12.model.Transacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransacoesService {
    private final List<Conta> contas = new ArrayList<>();

    public TransacoesService() {
        contas.add(new Conta("500-1", "Fulano", 1000.0));
        contas.add(new Conta("320-2", "Ciclano", 500.0));
    }

    public TransacaoResponseDTO gerarTransacao(TransacaoRequestDTO request) {
        Optional<Conta> contaOrigemOpt = contas.stream()
                .filter(conta -> conta.getCodigo().equals(request.origem()))
                .findFirst();
        Optional<Conta> contaDestinoOpt = contas.stream()
                .filter(conta -> conta.getCodigo().equals(request.destino()))
                .findFirst();

        if (contaOrigemOpt.isEmpty() || contaDestinoOpt.isEmpty()) {
            throw new RuntimeException("Conta de origem ou destino não encontrada");
        }

        Conta contaOrigem = contaOrigemOpt.get();
        Conta contaDestino = contaDestinoOpt.get();

        if (contaOrigem.getSaldo() < request.valor()) {
            throw new RuntimeException("Saldo insuficiente na conta de origem");
        }

        contaOrigem.setSaldo(contaOrigem.getSaldo() - request.valor());
        contaDestino.setSaldo(contaDestino.getSaldo() + request.valor());

        Transacao transacao = new Transacao(contaOrigem, contaDestino, request.valor());
        return new TransacaoResponseDTO(
                ContaMapper.toDTO(transacao.getOrigem()),
                ContaMapper.toDTO(transacao.getDestino()),
                transacao.getValor()
        );
    }

    public List<ContaDTO> listarContas() {
        return contas.stream().map(ContaMapper::toDTO).toList();
    }
}