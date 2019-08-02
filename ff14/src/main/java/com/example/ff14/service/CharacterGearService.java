package com.example.ff14.service;

import com.example.ff14.domain.CharacterGear;
import com.example.ff14.repository.CharacterGearRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class CharacterGearService {

    private CharacterGearRepository repository;

    @Autowired
    public CharacterGearService(CharacterGearRepository repository) {
        this.repository = repository;
    }

    public CharacterGear create(CharacterGear characterGear) {
        return repository.save(characterGear);
    }


    public CharacterGear retrieveCharacterGear(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<String> response = restTemplate.exchange("https://xivapi.com/character/" + id + "?extended=1", HttpMethod.GET, entity, String.class);

        JSONObject obj = new JSONObject(response.getBody());
        JSONObject gear = obj.getJSONObject("Character").getJSONObject("GearSet").getJSONObject("Gear");

        CharacterGear cg = new CharacterGear();
        cg.setEarrings(gear.getJSONObject("Earrings").getJSONObject("Item").getString("Name"));
        cg.setEarringsILVL(gear.getJSONObject("Earrings").getJSONObject("Item").getLong("LevelItem"));
        cg.setHands(gear.getJSONObject("Hands").getJSONObject("Item").getString("Name"));
        cg.setHandsILVL(gear.getJSONObject("Hands").getJSONObject("Item").getLong("LevelItem"));
        cg.setLegs(gear.getJSONObject("Legs").getJSONObject("Item").getString("Name"));
        cg.setLegsILVL(gear.getJSONObject("Legs").getJSONObject("Item").getLong("LevelItem"));
        cg.setNecklace(gear.getJSONObject("Necklace").getJSONObject("Item").getString("Name"));
        cg.setNecklaceILVL(gear.getJSONObject("Necklace").getJSONObject("Item").getLong("LevelItem"));
        cg.setHead(gear.getJSONObject("Head").getJSONObject("Item").getString("Name"));
        cg.setHeadILVL(gear.getJSONObject("Head").getJSONObject("Item").getLong("LevelItem"));
        cg.setFeet(gear.getJSONObject("Feet").getJSONObject("Item").getString("Name"));
        cg.setFeetILVL(gear.getJSONObject("Feet").getJSONObject("Item").getLong("LevelItem"));
        cg.setBracelets(gear.getJSONObject("Bracelets").getJSONObject("Item").getString("Name"));
        cg.setBraceletsILVL(gear.getJSONObject("Bracelets").getJSONObject("Item").getLong("LevelItem"));
        cg.setRing1(gear.getJSONObject("Ring1").getJSONObject("Item").getString("Name"));
        cg.setRing1ILVL(gear.getJSONObject("Ring1").getJSONObject("Item").getLong("LevelItem"));
        cg.setRing2(gear.getJSONObject("Ring2").getJSONObject("Item").getString("Name"));
        cg.setRing2ILVL(gear.getJSONObject("Ring2").getJSONObject("Item").getLong("LevelItem"));
        cg.setWaist(gear.getJSONObject("Waist").getJSONObject("Item").getString("Name"));
        cg.setWaistILVL(gear.getJSONObject("Waist").getJSONObject("Item").getLong("LevelItem"));
        cg.setMainhand(gear.getJSONObject("MainHand").getJSONObject("Item").getString("Name"));
        cg.setMainhandILVL(gear.getJSONObject("MainHand").getJSONObject("Item").getLong("LevelItem"));
        cg.setBody(gear.getJSONObject("Body").getJSONObject("Item").getString("Name"));
        cg.setBodyILVL(gear.getJSONObject("Body").getJSONObject("Item").getLong("LevelItem"));
        cg.setCharacter_id(id);

        create(cg);

        return cg;
    }
}
