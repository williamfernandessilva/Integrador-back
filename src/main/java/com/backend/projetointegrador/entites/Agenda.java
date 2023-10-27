package com.backend.projetointegrador.entites;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agendamento")
    private Long idAgendamento;

    @ManyToOne
    @JoinColumn(name = "sala", referencedColumnName = "sala")
    private Salas sala;

    @Column(name = "data")
    private Date data;

    @ManyToOne
    @JoinColumn(name = "horario_inicio", referencedColumnName = "horario")
    private Horarios horarioInicio;

    @ManyToOne
    @JoinColumn(name = "id_disciplinas")
    private Disciplinas disciplina;

    @ManyToOne
    @JoinColumn(name = "id_professor")
    private Professores professor;

    @ManyToOne
    @JoinColumn(name = "horario_termino", referencedColumnName = "horario")
    private Horarios horarioTermino;

    @ManyToOne
    @JoinColumn(name = "cursos", referencedColumnName = "id")
    private Cursos curso;

    public Long getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(Long idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Horarios getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Horarios horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Disciplinas getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public Horarios getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(Horarios horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

}
