package com.project.enlist.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.CandidateDisp;
@Repository
public interface CandidateDispRepo extends JpaRepository<CandidateDisp, String> {
	
}
