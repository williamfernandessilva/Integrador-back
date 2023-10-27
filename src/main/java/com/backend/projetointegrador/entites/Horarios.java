package com.backend.projetointegrador.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Horarios {
    @Id
    @Column(name = "horarios", length = 5)
    private String horarios;

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    
}
