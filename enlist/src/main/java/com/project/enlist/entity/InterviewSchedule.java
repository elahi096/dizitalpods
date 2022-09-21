package com.project.enlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interview_schedule")
public class InterviewSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;
	private String date;
	private String task;
	private String time;
	private String category;
	private String assignnedTo;

	public InterviewSchedule() {
		super();
	}

	public InterviewSchedule(int scheduleId, String date, String task, String time, String category,
			String assignnedTo) {
		super();
		this.scheduleId = scheduleId;
		this.date = date;
		this.task = task;
		this.time = time;
		this.category = category;
		this.assignnedTo = assignnedTo;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAssignnedTo() {
		return assignnedTo;
	}

	public void setAssignnedTo(String assignnedTo) {
		this.assignnedTo = assignnedTo;
	}

	@Override
	public String toString() {
		return "InterviewSchedule [scheduleId=" + scheduleId + ",date=" + date + ", task=" + task + ", time=" + time
				+ ", category=" + category + ", assignnedTo=" + assignnedTo + "]";
	}

}
