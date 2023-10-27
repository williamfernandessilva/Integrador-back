package com.backend.projetointegrador.dtos;

public record AgendaResponse(
        Long idAgendamento,
        String sala,
        String data,
        String horarioInicio,
        int idDisciplina,
        int idProfessor,
        String horarioTermino,
        int curso
) {
}
