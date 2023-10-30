package com.backend.projetointegrador.resources;

import java.net.URI;
import java.util.List;

import com.backend.projetointegrador.dtos.ProfessoresRequest;
import com.backend.projetointegrador.dtos.ProfessoresResponse;
import com.backend.projetointegrador.entites.Professores;
import com.backend.projetointegrador.mappers.ProfessoresMapper;
import com.backend.projetointegrador.services.ProfessoresService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin
@RequestMapping("professores")
public class ProfessoresController {

    @Autowired
    private ProfessoresService service;

    @GetMapping
    public ResponseEntity<List<ProfessoresResponse>> getProfessores() {
        var professores = this.service.getProfessores();
        return ResponseEntity.ok(ProfessoresMapper.toDTOList(professores));
    }

    @GetMapping("{id}")
    public ResponseEntity<ProfessoresResponse> getProfessor(@PathVariable long id) {
        var professor = this.service.getProfessor(id);
        return ResponseEntity.ok(ProfessoresMapper.toDTO(professor));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProfessor(@PathVariable long id) {
        this.service.deleteProfessorById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Object> save(@Validated @RequestBody ProfessoresRequest professor) {
        var savedProfessor = this.service.save(professor);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedProfessor.idProfessores())
                .toUri();

        return ResponseEntity.created(location).body(savedProfessor);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> update(@RequestBody Professores professor,
                                       @PathVariable long id) {
        this.service.update(id, professor);
        return ResponseEntity.ok().build();
    }
}
