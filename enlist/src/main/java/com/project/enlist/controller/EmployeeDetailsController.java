package com.project.enlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.enlist.entity.EmployeeDetailsDomain;
import com.project.enlist.service.EmployeeDetailsService;

@RestController
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsService service;
	
	@GetMapping("/employee")
	public List<EmployeeDetailsDomain> listAll(){
		return service.listAll();
	}

		@GetMapping("/employee/{eid}")
		public EmployeeDetailsDomain getTask(@PathVariable long eid)
		{
			return service.get(eid);
		}
		
		@PostMapping("/employee")
		public void addDetails(@RequestBody EmployeeDetailsDomain ed)
		{
			service.save(ed);
			}
		
		@PutMapping(value="/employee/{eid}")
		public ResponseEntity<?> editEmployeeDetails(@RequestBody EmployeeDetailsDomain newEmployeeDetails, @PathVariable long eid)
		{
			try
			{
				EmployeeDetailsDomain existingEmployeeDetails =service.get(eid);
				existingEmployeeDetails.setEmployeename(newEmployeeDetails.getEmployeename());
				existingEmployeeDetails.setDesignation(newEmployeeDetails.getDesignation());
				existingEmployeeDetails.setUsername(newEmployeeDetails.getUsername());
				existingEmployeeDetails.setPassword(newEmployeeDetails.getPassword());
				existingEmployeeDetails.setConfirmpassword(newEmployeeDetails.getConfirmpassword());
				existingEmployeeDetails.setEmail(newEmployeeDetails.getEmail());
				existingEmployeeDetails.setRollid(newEmployeeDetails.getRollid());
				service.save(existingEmployeeDetails);	
				return new ResponseEntity<>(HttpStatus.OK);
				}
			catch(Exception e)
			{
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		@DeleteMapping("/employee/{eid}")
		public void delete(@PathVariable long eid)
		{
			service.delete(eid);
		}
}
