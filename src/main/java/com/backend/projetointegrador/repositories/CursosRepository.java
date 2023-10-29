package com.backend.projetointegrador.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.projetointegrador.entites.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long> {
}
