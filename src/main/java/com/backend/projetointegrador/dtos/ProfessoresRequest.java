package com.backend.projetointegrador.dtos;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public record ProfessoresRequest(
        @NotBlank(message = "Nome do Professor não pode estar em branco") String nome,
        @NotBlank(message = "Nome do Curso não pode estar em branco") String curso,
        int semestre,
        String horario,
        String sala,
        LocalDate data
        ) {
}
