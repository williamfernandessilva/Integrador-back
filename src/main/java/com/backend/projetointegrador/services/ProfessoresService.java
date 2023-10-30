package com.backend.projetointegrador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.projetointegrador.dtos.ProfessoresRequest;
import com.backend.projetointegrador.dtos.ProfessoresResponse;
import com.backend.projetointegrador.entites.Professores;
import com.backend.projetointegrador.mappers.ProfessoresMapper;
import com.backend.projetointegrador.repositories.ProfessoresRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ProfessoresService {
    @Autowired
    private ProfessoresRepository repository;

    public List<Professores> getProfessores() {
        return this.repository.findAll();
    }

    public Professores getProfessor(long id) {
        return this.repository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Professor não encontrado")
        );
    }

    public void deleteProfessorById(long id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Professor não encontrado");
        }
    }

    public ProfessoresResponse save(ProfessoresRequest request) {
        var entity = this.repository.save(ProfessoresMapper.toEntity(request));
        return ProfessoresMapper.toDTO(entity);
    }

    public void update(long id, Professores professor) {
        try {
            var updateProfessor = this.repository.getReferenceById(id);
            updateProfessor.setNome(professor.getNome());
            updateProfessor.setSala(professor.getSala());
            updateProfessor.setData(professor.getData());
            updateProfessor.setCurso(professor.getCurso());
            updateProfessor.setSemestre(professor.getSemestre());
            updateProfessor.setHorario(professor.getHorario());
            this.repository.save(updateProfessor);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Professor não encontrado");
        }
    }
}
