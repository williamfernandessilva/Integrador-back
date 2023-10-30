package com.backend.projetointegrador.mappers;


import java.util.List;
import java.util.stream.Collectors;

import com.backend.projetointegrador.dtos.SalasRequest;
import com.backend.projetointegrador.dtos.SalasResponse;
import com.backend.projetointegrador.entites.Salas;


public class SalasMapper {
    public static Salas toEntity(SalasRequest request) {
        Salas salas = new Salas();
        salas.setSala(request.tipo()); 
        salas.setTipo(request.tipo());
        salas.setAndar(request.andar());
        salas.setCapacidade(request.capacidade());
        return salas;
    }

    public static SalasResponse toDTO(Salas salas) {
        return new SalasResponse(salas.getSala(), 
                salas.getTipo(),
                salas.getAndar(),
                salas.getCapacidade());
    }

    public static List<SalasResponse> toDTOList(List<Salas> salas) {
        return salas.stream()
                .map(SalasMapper::toDTO)
                .collect(Collectors.toList());
    }
}
