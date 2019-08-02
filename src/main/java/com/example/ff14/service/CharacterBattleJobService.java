package com.example.ff14.service;

import com.example.ff14.domain.CharacterBattleJob;
import com.example.ff14.repository.CharacterBattleJobRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class CharacterBattleJobService {

    private CharacterBattleJobRepository repository;

    @Autowired
    public CharacterBattleJobService(CharacterBattleJobRepository repository) {
        this.repository = repository;
    }

    public CharacterBattleJob create(CharacterBattleJob characterBattleJob) {
        return repository.save(characterBattleJob);
    }

    public String retrieveCharacterInformation(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<String> response = restTemplate.exchange("https://xivapi.com/character/" + id + "?extended=1", HttpMethod.GET, entity, String.class);

        return response.getBody();
    }

    public CharacterBattleJob retrieveCharacterJobs(Long id) {
        JSONObject obj = new JSONObject(retrieveCharacterInformation(id));
        JSONObject jobs = obj.getJSONObject("Character").getJSONObject("ClassJobs");

        CharacterBattleJob cbj = new CharacterBattleJob();
        cbj.setAstrologian(jobs.getJSONObject("33_33").getLong("Level"));
        cbj.setBard(jobs.getJSONObject("5_23").getLong("Level"));
        cbj.setBlack_mage(jobs.getJSONObject("7_25").getLong("Level"));
        cbj.setDancer(jobs.getJSONObject("38_38").getLong("Level"));
        cbj.setDark_knight(jobs.getJSONObject("32_32").getLong("Level"));
        cbj.setDragoon(jobs.getJSONObject("4_22").getLong("Level"));
        cbj.setGunbreaker(jobs.getJSONObject("37_37").getLong("Level"));
        cbj.setMachinist(jobs.getJSONObject("31_31").getLong("Level"));
        cbj.setMonk(jobs.getJSONObject("2_20").getLong("Level"));
        cbj.setNinja(jobs.getJSONObject("29_30").getLong("Level"));
        cbj.setPaladin(jobs.getJSONObject("1_19").getLong("Level"));
        cbj.setRed_mage(jobs.getJSONObject("35_35").getLong("Level"));
        cbj.setSamurai(jobs.getJSONObject("34_34").getLong("Level"));
        cbj.setScholar(jobs.getJSONObject("26_28").getLong("Level"));
        cbj.setSummoner(jobs.getJSONObject("26_27").getLong("Level"));
        cbj.setWarrior(jobs.getJSONObject("3_21").getLong("Level"));
        cbj.setWhite_mage(jobs.getJSONObject("6_24").getLong("Level"));
        cbj.setCharacter_id(id);

        create(cbj);

        return cbj;

    }

    public String retrieveCharacterGear(Long id) {
        JSONObject obj = new JSONObject(retrieveCharacterInformation(id));
        JSONObject gear = obj.getJSONObject("Character").getJSONObject("GearSet").getJSONObject("Gear");

        return gear.toString();

    }
}
