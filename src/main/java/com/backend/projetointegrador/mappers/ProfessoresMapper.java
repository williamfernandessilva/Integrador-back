package com.backend.projetointegrador.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.backend.projetointegrador.dtos.ProfessoresRequest;
import com.backend.projetointegrador.dtos.ProfessoresResponse;
import com.backend.projetointegrador.entites.Professores;

public class ProfessoresMapper {
    public static Professores toEntity(ProfessoresRequest request) {
        Professores professor = new Professores();
        professor.setNome(request.nome());
        professor.setEmail(request.email());
        professor.setTelefone(request.telefone());
        return professor;
    }

    public static ProfessoresResponse toDTO(Professores professor) {
        return new ProfessoresResponse(
            professor.getIdProfessores(),
            professor.getNome(),
            professor.getEmail(),
            professor.getTelefone()
        );
    }

    public static List<ProfessoresResponse> toDTOList(List<Professores> professores) {
        return professores.stream()
            .map(ProfessoresMapper::toDTO)
            .collect(Collectors.toList());
    }
}
