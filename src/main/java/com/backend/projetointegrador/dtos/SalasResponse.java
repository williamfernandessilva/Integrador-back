package com.backend.projetointegrador.dtos;

public record SalasResponse(
        String sala,
        String tipo,
        int andar,
        int capacidade) {

}
