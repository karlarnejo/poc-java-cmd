package com.poc.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.demo.entity.Userr;

@Repository
public interface CrudRepositoryUser extends JpaRepository<Userr, Long> {
	public Userr findByUsername(String username);
}