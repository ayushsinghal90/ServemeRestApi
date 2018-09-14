package com.serveme.data.customer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomRepo extends MongoRepository<Custom,Integer> {

}
