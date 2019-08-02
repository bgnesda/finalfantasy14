package com.example.ff14.repository;

import com.example.ff14.domain.CharacterGatheringJob;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterGatheringJobRepository extends PagingAndSortingRepository<CharacterGatheringJob, Long> {
}
