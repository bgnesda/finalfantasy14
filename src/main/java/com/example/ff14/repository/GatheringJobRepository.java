package com.example.ff14.repository;

import com.example.ff14.domain.GatheringJob;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GatheringJobRepository extends PagingAndSortingRepository<GatheringJob, Long> {
}
