package com.ust.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends  MongoRepository<Role, String>{
	
}