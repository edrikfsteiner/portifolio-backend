package com.exercicio13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio13.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
}