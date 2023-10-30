package com.backend.projetointegrador.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.backend.projetointegrador.dtos.CursosRequest;
import com.backend.projetointegrador.dtos.CursosResponse;
import com.backend.projetointegrador.entites.Cursos;

public class CursosMapper {
    public static Cursos toEntity(CursosRequest request) {
        Cursos curso = new Cursos();
        curso.setCursos(request.cursos());
        return curso;
    }

    public static CursosResponse toDTO(Cursos curso) {
        return new CursosResponse(
            curso.getId(),
            curso.getCursos()
        );
    }

    public static List<CursosResponse> toDTOList(List<Cursos> cursos) {
        return cursos.stream()
            .map(CursosMapper::toDTO)
            .collect(Collectors.toList());
    }
}
