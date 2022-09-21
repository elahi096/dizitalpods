package com.project.enlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.ClientDetailsDomain;

@Repository
public interface ClientDetailsRepo extends JpaRepository<ClientDetailsDomain, Long>  {

}
