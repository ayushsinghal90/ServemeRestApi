package com.serveme.data.sales;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesRepo extends MongoRepository<Sales,Integer> {
}
