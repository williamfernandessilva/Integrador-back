package com.backend.projetointegrador.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.backend.projetointegrador.dtos.CoordenadorRequest;
import com.backend.projetointegrador.dtos.CoordenadorResponse;
import com.backend.projetointegrador.entites.Coordenador;

public class CoordenadorMapper {
    public static Coordenador toEntity(CoordenadorRequest request) {
        Coordenador coordenador = new Coordenador();
        coordenador.setNome(request.nome());
        coordenador.setCargo(request.cargo());
        coordenador.setEmail(request.email());
        return coordenador;
    }

    public static CoordenadorResponse toDTO(Coordenador coordenador) {
        return new CoordenadorResponse(
            coordenador.getId(),
            coordenador.getNome(),
            coordenador.getCargo(),
            coordenador.getEmail()
        );
    }

    public static List<CoordenadorResponse> toDTOList(List<Coordenador> coordenadores) {
        return coordenadores.stream()
            .map(CoordenadorMapper::toDTO)
            .collect(Collectors.toList());
    }
}
