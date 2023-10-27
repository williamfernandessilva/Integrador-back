package com.backend.projetointegrador.dtos;

import jakarta.validation.constraints.NotBlank;

public record CoordenadorRequest(
        @NotBlank(message = "Nome não pode estar em branco") String nome,
        @NotBlank(message = "Cargo não pode estar em branco") String cargo,
        @NotBlank(message = "Email não pode estar em branco") String email
) {
}