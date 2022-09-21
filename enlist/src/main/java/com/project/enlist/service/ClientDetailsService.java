package com.project.enlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.enlist.entity.ClientDetailsDomain;
import com.project.enlist.repository.ClientDetailsRepo;

@Service
public class ClientDetailsService {

	@Autowired
	private ClientDetailsRepo repo;

	public List<ClientDetailsDomain> listAll()
	{
		return repo.findAll();
	}
	public void save(ClientDetailsDomain clientdetails) {
		repo.save(clientdetails);
	}
	public ClientDetailsDomain get(long id)
	{
		return repo.findById(id).get();
	}
	public void delete(long id)
	{
		repo.deleteById(id);
	}
}
