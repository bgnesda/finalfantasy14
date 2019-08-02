package com.example.ff14.controller;

import com.example.ff14.domain.CharacterBattleJob;
import com.example.ff14.service.CharacterBattleJobService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Log4j2
@RestController
public class CharacterBattleJobController {

    @NotNull
    private CharacterBattleJobService service;

    public CharacterBattleJobController(CharacterBattleJobService service) {
        this.service = service;
    }

    @RequestMapping(value = "/character/jobs/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public CharacterBattleJob retrieveCharacterJobs(@PathVariable(name = "id") Long id) {
        return service.retrieveCharacterJobs(id);
    }


}
