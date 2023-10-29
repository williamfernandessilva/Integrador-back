package com.backend.projetointegrador.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.projetointegrador.entites.Coordenador;

public interface CoordenadorRepository extends JpaRepository<Coordenador, Long> {
}
