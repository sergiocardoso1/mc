package com.srg.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srg.mc.domain.Cliente;

@Repository
public interface ClienteReposity extends JpaRepository<Cliente, Integer>{
	
	


}
