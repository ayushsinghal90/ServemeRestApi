package com.serveme.data.employ;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployRepo extends MongoRepository<Employ, Integer>{
}
