package com.orbitbank.bankservicemain.repository;

import com.orbitbank.bankservicemain.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends MongoRepository<Customer, Long> {
}
