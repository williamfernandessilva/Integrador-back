package com.backend.projetointegrador.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Disciplinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_disciplinas")
    private Long idDisciplinas;

    @Column(length = 100)
    private String disciplinas;

    public Long getIdDisciplinas() {
        return idDisciplinas;
    }

    public void setIdDisciplinas(Long idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }


}
