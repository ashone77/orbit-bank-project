package com.orbitbank.partnerservice.repository;

import com.orbitbank.partnerservice.insurance.Health;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthInsuranceRepository extends MongoRepository<Health,String> {
}
