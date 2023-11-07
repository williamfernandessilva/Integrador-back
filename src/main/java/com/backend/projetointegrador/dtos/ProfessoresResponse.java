package com.backend.projetointegrador.dtos;

import java.time.LocalDate;

public record ProfessoresResponse(
        Long ra,
        String nome,
        String curso,
        int semestre,
        String horario,
        String materia,
        String sala,
        LocalDate data
        ) {
}
