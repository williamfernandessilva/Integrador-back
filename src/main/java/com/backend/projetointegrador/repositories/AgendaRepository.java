package com.backend.projetointegrador.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.projetointegrador.entites.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    
}
