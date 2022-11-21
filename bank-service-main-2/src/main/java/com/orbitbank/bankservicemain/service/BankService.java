package com.orbitbank.bankservicemain.service;

import com.orbitbank.bankservicemain.model.Customer;
import com.orbitbank.bankservicemain.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;


}
