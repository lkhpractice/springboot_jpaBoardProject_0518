package com.lkhpractice.board.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lkhpractice.board.entity.SiteMember;

public interface SiteMemberRepository extends JpaRepository<SiteMember, Integer> {
	
	public Optional<SiteMember> findByUsername(String username);

}
