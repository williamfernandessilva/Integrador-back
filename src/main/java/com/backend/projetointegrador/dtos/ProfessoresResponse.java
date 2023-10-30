package com.backend.projetointegrador.dtos;

import java.time.LocalDate;

public record ProfessoresResponse(
        Long idProfessores,
        String nome,
        String curso,
        int semestre,
        String horario,
        String sala,
        LocalDate data
        ) {
}
