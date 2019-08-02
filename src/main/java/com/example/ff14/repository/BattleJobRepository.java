package com.example.ff14.repository;

import com.example.ff14.domain.BattleJob;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleJobRepository extends PagingAndSortingRepository<BattleJob, Long> {
}
