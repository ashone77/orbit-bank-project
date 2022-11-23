package com.orbitbank.partnerservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralInsurance extends MongoRepository<com.orbitbank.partnerservice.insurance.GeneralInsurance, String> {
}
