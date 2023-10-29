package com.backend.projetointegrador.dtos;
import jakarta.validation.constraints.NotBlank;

public record ProfessoresRequest(
        @NotBlank(message = "Nome do Professor não pode ser nulo") String nome,
        @NotBlank(message = "Email do Professor não pode estar em branco") String email,
        @NotBlank(message = "Telefone do Professor não pode estar em branco") String telefone) {
}
