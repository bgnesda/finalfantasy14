package com.example.ff14.repository;

import com.example.ff14.domain.CharacterCraftingJob;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterCraftingJobRepository extends PagingAndSortingRepository<CharacterCraftingJob, Long> {
}
