package com.orbitbank.partnerservice.service;

import com.orbitbank.partnerservice.insurance.GeneralInsurance;
import com.orbitbank.partnerservice.insurance.Health;
import com.orbitbank.partnerservice.insurance.Life;
import com.orbitbank.partnerservice.model.Partner;
import com.orbitbank.partnerservice.repository.HealthInsuranceRepository;
import com.orbitbank.partnerservice.repository.LifeInsuranceRepository;
import com.orbitbank.partnerservice.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerService {

    @Autowired
    private PartnerRepository partnerRepository;

    @Autowired
    private com.orbitbank.partnerservice.repository.GeneralInsurance generalInsuranceRepository;

    @Autowired
    private HealthInsuranceRepository healthInsuranceRepository;

    @Autowired
    private LifeInsuranceRepository lifeInsuranceRepository;

    public PartnerService(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    public Partner save(Partner partner) {
        return partnerRepository.save(partner);
    }

    public List<Partner> getAllPartners() {
        return partnerRepository.findAll();
    }

    public GeneralInsurance addNewGeneralInsurance(GeneralInsurance generalInsurance) {
        return generalInsuranceRepository.save(generalInsurance);
    }

    public Health addNewHealthInsurance(Health healthInsurance) {
        return healthInsuranceRepository.save(healthInsurance);
    }

    public Life addNewLifeInsurance(Life lifeInsurance) {
        return lifeInsuranceRepository.save(lifeInsurance);
    }
}
