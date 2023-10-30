package com.backend.projetointegrador.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.backend.projetointegrador.dtos.DisciplinasRequest;
import com.backend.projetointegrador.dtos.DisciplinasResponse;
import com.backend.projetointegrador.entites.Disciplinas;

public class DisciplinasMapper {
    public static Disciplinas toEntity(DisciplinasRequest request) {
        Disciplinas disciplina = new Disciplinas();
        disciplina.setDisciplinas(request.disciplinas());
        return disciplina;
    }

    public static DisciplinasResponse toDTO(Disciplinas disciplina) {
        return new DisciplinasResponse(
            disciplina.getIdDisciplinas(),
            disciplina.getDisciplinas()
        );
    }

    public static List<DisciplinasResponse> toDTOList(List<Disciplinas> disciplinas) {
        return disciplinas.stream()
            .map(DisciplinasMapper::toDTO)
            .collect(Collectors.toList());
    }
}
