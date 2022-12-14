package com.orbitbank.partnerservice.repository;

import com.orbitbank.partnerservice.model.Partner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends MongoRepository<Partner, String> {
}
