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

import com.project.enlist.entity.RoleDetailsDomain;
import com.project.enlist.service.RoleDetailsService;

@RestController
public class RoleDetailsController {

	@Autowired
	private RoleDetailsService service;
	
	@GetMapping("/role")
	public List<RoleDetailsDomain> listAll() {
		return service.listAll();
	}

	@GetMapping("/role/{id}")
	public RoleDetailsDomain getTask(@PathVariable long id) {
		return service.get(id);
	}
	
	@PostMapping("/role")
	public void addRole(@RequestBody RoleDetailsDomain rdd)
	{
		service.save(rdd);
	}

	/*
	 * @RequestMapping(value = "/role", method = RequestMethod.POST) public
	 * ResponseEntity<String> saveStudent(@RequestBody RoleDetailsDomain role) {
	 * service.save(role); String msg = "success"; return new ResponseEntity<>(msg,
	 * HttpStatus.OK); }
	 */

	/*
	 * @PutMapping("/role/{id}") public RoleDetailsDomain
	 * showEditRolePage(@RequestBody RoleDetailsDomain newrole,
	 * 
	 * @PathVariable(name = "id") int id) { RoleDetailsDomain role =
	 * service.get(id); role.setRolename(newrole.getRolename()); service.save(role);
	 * return role;
	 * 
	 * }
	 */
	
	@PutMapping(value="/role/{id}")
	public ResponseEntity<?> editRoleDetails(@RequestBody RoleDetailsDomain newRoleDetails, @PathVariable long id)
	{
		try
		{
			RoleDetailsDomain existingRoleDetails = service.get(id);
			existingRoleDetails.setRolename(newRoleDetails.getRolename());
			service.save(existingRoleDetails);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping ("/role/{id}")
	public void delete (@PathVariable long id)
	{
		service.delete(id);
	}
	/*
	 * @RequestMapping(value = "/role/{id}", method = RequestMethod.DELETE) public
	 * String deletestudent(@PathVariable(name = "id") int id) { service.delete(id);
	 * return "redirect:/"; }
	 */
}
