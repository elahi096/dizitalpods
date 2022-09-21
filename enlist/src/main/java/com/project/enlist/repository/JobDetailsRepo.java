package com.project.enlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.JobDetailsDomain;

@Repository
public interface JobDetailsRepo extends JpaRepository<JobDetailsDomain, Long> {

}
