package com.example.ff14.repository;

import com.example.ff14.domain.CraftingJob;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CraftingJobRepository extends PagingAndSortingRepository<CraftingJob, Long> {
}
