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
        professor.setCurso(request.curso());
        professor.setSemestre(request.semestre());
        professor.setMateria(request.materia()); 
        professor.setHorario(request.horario()); 
        professor.setSala(request.sala()); 
        professor.setData(request.data());
        return professor;
    }

    public static ProfessoresResponse toDTO(Professores professor) {
        return new ProfessoresResponse(
            professor.getRa(),
            professor.getNome(),
            professor.getCurso(), 
            professor.getSemestre(), 
            professor.getMateria(),
            professor.getHorario(), 
            professor.getSala(), 
            professor.getData()
        );
    }

    public static List<ProfessoresResponse> toDTOList(List<Professores> professores) {
        return professores.stream()
            .map(ProfessoresMapper::toDTO)
            .collect(Collectors.toList());
    }
}
