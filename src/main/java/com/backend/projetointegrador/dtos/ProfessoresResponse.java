package com.backend.projetointegrador.dtos;

public record ProfessoresResponse(
        Long idProfessores,
        String nome,
        String email,
        String telefone) {
}
