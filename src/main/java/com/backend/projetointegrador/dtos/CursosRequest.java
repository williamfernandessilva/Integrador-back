package com.backend.projetointegrador.dtos;
import jakarta.validation.constraints.NotNull;

public record CursosRequest(
        @NotNull(message = "Nome do curso não pode estar em branco") String cursos) {
}