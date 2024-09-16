package org.example.exercicio08;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/fipe")
public class FipeController {

    private final WebClient webClient;

    public FipeController(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://brasilapi.com.br/api/fipe").build();
    }

    @PostMapping("/valor")
    public ResponseEntity<FipeResponse> getFipeValue(@RequestBody CarRequest carRequest) {
        // Construa a URL dinâmica baseada na marca, modelo e ano
        String url = String.format("/preco/v1/%s/%s/%s", carRequest.getMarca(), carRequest.getModelo(), carRequest.getAno());

        // Fazendo a requisição usando o RestClient
        FipeResponse response = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(FipeResponse.class)
                .block(); // Bloqueia até a resposta ser recebida (sincronamente)

        return ResponseEntity.ok(response);
    }
}
