package com.orbitbank.bankservicemain.service;

import com.orbitbank.bankservicemain.model.Partner;
import com.orbitbank.bankservicemain.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    public ResponseEntity<Partner> authorizePartner(String partnerId) {
        Optional<Partner> partnerOptional = bankRepository.findByPartnerId(partnerId);
        System.out.println(partnerOptional);
        if(partnerOptional.isPresent()){
            Partner _partner = partnerOptional.get();
            _partner.setAuthorized(true);
            return new ResponseEntity<>(bankRepository.save(_partner), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public List<Partner> getAllPartners() {
        return bankRepository.findAll();
    }
}
