package com.backend.projetointegrador.dtos;
import jakarta.validation.constraints.NotNull;

public record DisciplinasRequest(
        @NotNull(message = "Nome da disciplina não pode estar em branco") String disciplinas) {
}