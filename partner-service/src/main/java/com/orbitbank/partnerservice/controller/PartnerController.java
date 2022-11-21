package com.orbitbank.partnerservice.controller;


import com.orbitbank.partnerservice.model.Partner;
import com.orbitbank.partnerservice.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orbit/partner/")
public class PartnerController {

    @Autowired
    private PartnerService partnerService;

    @PostMapping("/partnerRegistration")
    public Partner registerPartner(@RequestBody Partner partner){
        return partnerService.save(partner);
    }

}
