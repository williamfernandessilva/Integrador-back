package com.backend.projetointegrador.dtos;

import jakarta.validation.constraints.NotBlank;

public record SalasRequest(
    @NotBlank(message = "Tipo da sala não pode estar em branco")String tipo,
    int andar,
    int capacidade
) {
} 
