package com.example.cafitest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.cafitest.model.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
}
