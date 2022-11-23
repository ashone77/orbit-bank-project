package com.orbitbank.partnerservice.controller;


import com.orbitbank.partnerservice.insurance.GeneralInsurance;
import com.orbitbank.partnerservice.insurance.Health;
import com.orbitbank.partnerservice.insurance.Life;
import com.orbitbank.partnerservice.model.Partner;
import com.orbitbank.partnerservice.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orbit/partner/")
public class PartnerController {

    @Autowired
    private PartnerService partnerService;

    @PostMapping("/partnerRegistration")
    public Partner registerPartner(@RequestBody Partner partner){
        return partnerService.save(partner);
    }

    @GetMapping("/")
    public List<Partner> getAllPartners(){
        return partnerService.getAllPartners();
    }

    @PostMapping("/newGeneralInsurance")
    public GeneralInsurance addNewGeneralInsurance(@RequestBody GeneralInsurance generalInsurance){
        return partnerService.addNewGeneralInsurance(generalInsurance);
    }

    @PostMapping("/newHealthInsurance")
    public Health addNewHealthInsurance(@RequestBody Health healthInsurance){
        return partnerService.addNewHealthInsurance(healthInsurance);
    }

    @PostMapping("/newLifeInsurance")
    public Life addNewLifeInsurance(@RequestBody Life lifeInsurance){
        return partnerService.addNewLifeInsurance(lifeInsurance);
    }




}
