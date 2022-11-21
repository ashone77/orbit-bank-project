package com.orbitbank.bankservicemain.controller;

import com.orbitbank.bankservicemain.model.Admin;
import com.orbitbank.bankservicemain.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/authorizePartner/{id}")
    public Boolean authorizePartner(@RequestParam("id") String partnerId){
        
    }


}
