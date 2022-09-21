package com.project.enlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.enlist.entity.InterviewSchedule;
import com.project.enlist.repository.InterviewScheduleRepo;

@Service
public class InterviewScheduleService {
	
	@Autowired
	private InterviewScheduleRepo repo;
	
	public List<InterviewSchedule> fetch(){
		return repo.findAll();
	}
	
	public List<InterviewSchedule> findByDate(String date){
		return repo.findByDate(date);
	}
	
	public InterviewSchedule findWithId(int scheduleId){
		return repo.findById(scheduleId).get();
	}
	
	public void save(InterviewSchedule inteview) {
		repo.save(inteview);
	}
	
	public void delete(int scheduleId)
	{
		repo.deleteById(scheduleId);
	}
	
}