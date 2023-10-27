package com.backend.projetointegrador.dtos;
import jakarta.validation.constraints.NotNull;

public record AgendaRequest(
        @NotNull(message = "Sala não pode estar em branco") String sala,
        @NotNull(message = "Data não pode estar em branco") String data,
        @NotNull(message = "Horário de início não pode estar em branco") String horarioInicio,
        int idDisciplina,
        int idProfessor,
        @NotNull(message = "Horário de término não pode estar em branco") String horarioTermino,
        int curso
) {
}
