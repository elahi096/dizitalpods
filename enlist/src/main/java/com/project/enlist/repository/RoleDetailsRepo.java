package com.project.enlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.RoleDetailsDomain;

@Repository
public interface RoleDetailsRepo extends JpaRepository <RoleDetailsDomain, Long> {

}
