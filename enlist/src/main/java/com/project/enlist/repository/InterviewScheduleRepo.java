package com.project.enlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.InterviewSchedule;

@Repository
public interface InterviewScheduleRepo extends JpaRepository<InterviewSchedule, Integer> 
{
	@Query("SELECT c FROM InterviewSchedule c WHERE c.date=:d")
	public List<InterviewSchedule> findByDate(@Param("d") String date);
}
