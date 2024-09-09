package org.example.exercicio07;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {
    @GetMapping("/recomendar")
    public String recomendarFilme(@RequestParam String genero, @RequestParam String ambiente) {
        if ("sci-fi".equalsIgnoreCase(genero) && "comedia".equalsIgnoreCase(ambiente)) {
            return "Homens de Preto";
        } else if ("sci-fi".equalsIgnoreCase(genero) && "drama".equalsIgnoreCase(ambiente)) {
            return "Arrival";
        } else if ("medieval".equalsIgnoreCase(genero) && "comedia".equalsIgnoreCase(ambiente)) {
            return "Shrek";
        } else if ("medieval".equalsIgnoreCase(genero) && "drama".equalsIgnoreCase(ambiente)) {
            return "Gladiador";
        } else {
            return "Sem recomendações para esse critério.";
        }
    }
}