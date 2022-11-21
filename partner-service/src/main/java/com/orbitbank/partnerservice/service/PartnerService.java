package com.orbitbank.partnerservice.service;

import com.orbitbank.partnerservice.model.Partner;
import com.orbitbank.partnerservice.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class PartnerService {

    @Autowired
    private PartnerRepository partnerRepository;


    public Partner save(Partner partner) {
        return partnerRepository.save(partner);
    }
}
