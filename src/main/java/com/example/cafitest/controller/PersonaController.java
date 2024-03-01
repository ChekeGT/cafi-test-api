package com.example.cafitest.controller;

import com.example.cafitest.model.Persona;
import com.example.cafitest.services.PersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/persons")
public class PersonaController {
    @Autowired
    PersonaServices personaService;

    @GetMapping("/getAllPersons")
    public ArrayList<Persona> getPersons(){
        return personaService.getPersons();
    }

    @GetMapping("/getPersonById/{id}")
    public Optional<Persona> getPersonById(@PathVariable Long id){
        return personaService.getById(id);
    }

    @PostMapping("/create")
    public Persona savePerson(@RequestBody Persona persona){
        return personaService.savePerson(persona);
    }

}
