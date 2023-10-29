package com.backend.projetointegrador.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.projetointegrador.entites.Professores;

public interface ProfessoresRepository extends JpaRepository<Professores, Long> {
}
