package com.backend.projetointegrador.mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.backend.projetointegrador.dtos.HorariosRequest;
import com.backend.projetointegrador.dtos.HorariosResponse;
import com.backend.projetointegrador.entites.Horarios;

public class HorariosMapper {
    public static Horarios toEntity(HorariosRequest request) {
        Horarios horario = new Horarios();
        horario.setHorarios(request.horarios());
        return horario;
    }

    public static HorariosResponse toDTO(Horarios horario) {
        return new HorariosResponse(horario.getHorarios());
    }

    public static List<HorariosResponse> toDTOList(List<Horarios> horarios) {
        return horarios.stream()
            .map(HorariosMapper::toDTO)
            .collect(Collectors.toList());
    }
}
