package com.backend.projetointegrador.dtos;

public record ProfessoresResponse(
        Long id,
        String nome,
        String curso,
        String horario,
        String materia,
        String sala,
        String data
        ) {
}
