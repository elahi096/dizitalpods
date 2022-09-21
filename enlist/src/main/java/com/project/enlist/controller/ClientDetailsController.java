package com.project.enlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.enlist.entity.ClientDetailsDomain;
import com.project.enlist.service.ClientDetailsService;

@RestController
public class ClientDetailsController {
	@Autowired
	private ClientDetailsService service;
	
	@GetMapping("/client")
	public List<ClientDetailsDomain> listAll(){
		return service.listAll();
				}
	
	@GetMapping("/client/{id}")
	public ClientDetailsDomain getTask(@PathVariable long id) {
		return service.get(id);
	}
	
	@PostMapping ("/client")
	public void addClient(@RequestBody ClientDetailsDomain cdd)
	{
	service.save(cdd);	
	}
	
	/*
	 * @RequestMapping(value= "/clientcreate", method=RequestMethod.POST) public
	 * ResponseEntity<String> saveStudent(@RequestBody ClientDetailsDomain client) {
	 * service.save(client); String msg ="success"; return new ResponseEntity<>(msg,
	 * HttpStatus.OK); }
	 */
	
	@PutMapping("/client/{id}")
	public ResponseEntity<?> editClientDetails(@RequestBody ClientDetailsDomain newClient, @PathVariable long id)
	{
		try
		{
		ClientDetailsDomain client=service.get(id);
		client.setClientname(newClient.getClientname());
		client.setPrinciplecontact(newClient.getPrinciplecontact());
		client.setEmail(newClient.getEmail());
		client.setAddress(newClient.getAddress());
		client.setLocation(newClient.getLocation());
		service.save(client);
		return new ResponseEntity<>(HttpStatus.OK);
	}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	/*
	 * @PutMapping("/clientedit/{id}") public ClientDetailsDomain
	 * showEditClientPage(@RequestBody ClientDetailsDomain newclient, int id) {
	 * ClientDetailsDomain client=service.get(id);
	 * client.setClientname(newclient.getClientname());
	 * client.setPrinciplecontact(newclient.getPrinciplecontact());
	 * client.setEmail(newclient.getEmail());
	 * client.setAddress(newclient.getAddress());
	 * client.setLocation(newclient.getLocation()); service.save(client); return
	 * client; }
	 */
	
	@RequestMapping(value="/client/{id}", method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable(name="id")int id) {
		service.delete(id);
	}
}
