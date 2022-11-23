package com.orbitbank.bankservicemain.controller;

import com.orbitbank.bankservicemain.model.Admin;
import com.orbitbank.bankservicemain.model.Partner;
import com.orbitbank.bankservicemain.service.BankService;

import com.orbitbank.bankservicemain.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/orbit/")
public class BankController {

    @Autowired
    private BankService bankService;


    @PostMapping("/adminLogin")
    public Boolean adminLogin(@RequestBody Admin admin){
        if(admin.getUsername().equals("admin") && admin.getPassword().equals("orbit_bank")){
            return true;
        }
        return false;
    }

    @PutMapping("/authorizePartner/{id}")
    public void authorizePartner(@PathVariable("id") String partnerId){
        bankService.authorizePartner(partnerId);
    }

    @GetMapping("/")
    public List<Partner> getAllPartners(){
        return bankService.getAllPartners();
    }




}
