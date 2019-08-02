package com.example.ff14.controller;

import com.example.ff14.domain.Character;
import com.example.ff14.service.CharacterService;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Log4j2
@RestController
public class CharacterController {

    @NotNull
    private CharacterService service;

    public CharacterController(CharacterService service) {
        this.service = service;
    }

    @GetMapping("/characters")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Page<Character> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/character/id/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Optional<Character> findById(@PathVariable(name = "id") Long id) {
        return service.findById(id);
    }

    @GetMapping("/character/name/{name}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Optional<Character> findByName(@PathVariable(name = "name") String name) {
        return service.findByName(name);
    }

    @RequestMapping(value = "/character/name/{name}/server/{server}", method = RequestMethod.GET)
    @ResponseBody
    public void retrieveCharacter(@PathVariable(name = "name") String name, @PathVariable(name = "server") String server) {
        service.retrieveCharacter(name, server);
    }

    @PostMapping("/character")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Character create(@Valid @RequestBody Character character) {
        return service.create(character);
    }

    @PutMapping("/character")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Character update(@Valid @RequestBody Character character) {
        return service.update(character);
    }
}
