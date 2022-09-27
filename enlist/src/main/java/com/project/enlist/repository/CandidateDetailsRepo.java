package com.project.enlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.CandidateDetailsDomain;

@Repository
public interface CandidateDetailsRepo extends JpaRepository<CandidateDetailsDomain, Long> {

	@Query("SELECT c FROM CandidateDetailsDomain c WHERE c.lockedstatus=:d")
	public List<CandidateDetailsDomain> findByLockedStatus(@Param("d") String lockedstatus);
}
