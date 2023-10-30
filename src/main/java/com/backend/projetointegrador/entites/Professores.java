package com.backend.projetointegrador.entites;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PROFESSORES")
public class Professores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfessores;

    @Column(length = 90)
    private String nome;

    @Column(length = 100, name = "cursos")
    private String curso;

    @Column
    private int semestre;

    @Column(length = 13, name = "horario")
    private String horario;

    @Column(length = 8, name = "salas")
    private String sala;

    @Column
    private LocalDate data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Long getIdProfessores() {
        return idProfessores;
    }

    public void setIdProfessores(Long idProfessores) {
        this.idProfessores = idProfessores;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
