package com.project.enlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.CandidateDetailsDomain;

@Repository
public interface CandidateDetailsRepo extends JpaRepository<CandidateDetailsDomain, Long> {

}
