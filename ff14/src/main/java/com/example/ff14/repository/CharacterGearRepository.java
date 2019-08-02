package com.example.ff14.repository;

import com.example.ff14.domain.CharacterGear;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterGearRepository extends PagingAndSortingRepository<CharacterGear, Long> {
}
