package com.backend.projetointegrador.dtos;
import jakarta.validation.constraints.NotBlank;

public record CursosRequest(
        @NotBlank(message = "Nome do curso não pode estar em branco") String cursos) {
}