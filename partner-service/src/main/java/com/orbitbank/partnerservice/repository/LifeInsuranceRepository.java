package com.orbitbank.partnerservice.repository;

import com.orbitbank.partnerservice.insurance.Life;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LifeInsuranceRepository extends MongoRepository<Life,String> {
}
