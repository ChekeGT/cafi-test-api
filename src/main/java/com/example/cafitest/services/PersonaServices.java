package com.example.cafitest.services;

import com.example.cafitest.model.Persona;
import com.example.cafitest.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonaServices {

    @Autowired
    PersonaRepository personaRepository;

    public ArrayList<Persona> getPersons(){
        return (ArrayList<Persona>) personaRepository.findAll();
    }

    public Persona savePerson(Persona persona){
        return personaRepository.save(persona);
    }

    public Optional<Persona> getById(Long id){
        return personaRepository.findById(id);
    }

    public Persona updatePersona(Long id, Optional<String> name, Optional<Integer> age){
        Persona persona = personaRepository.findById(id).orElse(null);
        if (persona != null){
            name.ifPresent(persona::setName);
            age.ifPresent(persona::setAge);
        }
        return persona;
    }
}
