package com.project.enlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.ReferralPageDomain;

@Repository
public interface ReferralPageRepo extends JpaRepository<ReferralPageDomain, Integer> {

}
