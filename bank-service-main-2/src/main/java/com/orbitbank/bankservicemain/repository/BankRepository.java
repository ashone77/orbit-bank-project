package com.orbitbank.bankservicemain.repository;

import com.orbitbank.bankservicemain.model.Partner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankRepository extends MongoRepository<Partner, Long> {
    Optional<Partner> findByPartnerId(String partnerId);
}
