package com.example.ff14.repository;

import com.example.ff14.domain.Character;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CharacterRepository extends PagingAndSortingRepository<Character, Long> {
    Optional<Character> findByName(String name);
}
