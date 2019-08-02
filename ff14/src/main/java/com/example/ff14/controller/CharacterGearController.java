package com.example.ff14.controller;

import com.example.ff14.domain.CharacterGear;
import com.example.ff14.service.CharacterGearService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Log4j2
@RestController
public class CharacterGearController {
    @NotNull
    private CharacterGearService service;

    public CharacterGearController(CharacterGearService service) {
        this.service = service;
    }

    @RequestMapping(value = "/character/gear/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CharacterGear retrieveCharacterGear(@PathVariable(name = "id") Long id) {
        return service.retrieveCharacterGear(id);
    }

}
