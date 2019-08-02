package com.example.ff14.service;

import com.example.ff14.domain.Character;
import com.example.ff14.repository.CharacterRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Optional;


@Service
public class CharacterService {
    private CharacterRepository repository;

    @Autowired
    public CharacterService(CharacterRepository repository) {
        this.repository = repository;
    }

    public Page<Character> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Optional<Character> findById(Long id) {
        return repository.findById(id);
    }

    public Optional<Character> findByName(String name) {
        return repository.findByName(name);
    }

    public Character create(Character character) {
        return repository.save(character);
    }

    public Character update(Character character) {
        return repository.save(character);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void retrieveCharacter(String name, String server) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<String> response = restTemplate.exchange("https://xivapi.com/character/search?name=" + name + "&server=" + server, HttpMethod.GET, entity, String.class);

        JSONObject obj = new JSONObject(response.getBody());
        JSONArray results = obj.getJSONArray("Results");

        Character character = new Character();
        character.setName(results.getJSONObject(0).getString("Name"));
        character.setAvatar(results.getJSONObject(0).getString("Avatar"));
        character.setId(results.getJSONObject(0).getLong("ID"));

        create(character);

    }

}
