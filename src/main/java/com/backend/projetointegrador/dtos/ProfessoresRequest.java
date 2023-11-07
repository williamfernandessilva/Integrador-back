        package com.backend.projetointegrador.dtos;

        import jakarta.validation.constraints.NotBlank;

        public record ProfessoresRequest(
                @NotBlank(message = "Nome do Professor não pode estar em branco") String nome,
                @NotBlank(message = "Nome do Curso não pode estar em branco") String curso,
                @NotBlank(message="Nome da Matéria não pode estar em branco")String materia,
                @NotBlank(message="Horario não pode estar em branco")String horario,
                @NotBlank(message="Sala não pode estar em branco")String sala,
                @NotBlank(message="Date não pode estar em branco")String data
                ) {
        }
