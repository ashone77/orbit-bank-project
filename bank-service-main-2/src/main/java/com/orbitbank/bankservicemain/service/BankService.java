package com.orbitbank.bankservicemain.service;

import com.orbitbank.bankservicemain.model.Partner;
import com.orbitbank.bankservicemain.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    @Autowired
    private EmailSenderService emailSenderService;

    public ResponseEntity<Partner> authorizePartner(String partnerId) {
        Optional<Partner> partnerOptional = bankRepository.findByPartnerId(partnerId);
        System.out.println(partnerOptional);
        if(partnerOptional.isPresent()){
            Partner _partner = partnerOptional.get();
            _partner.setAuthorized(true);
            try {
                emailSenderService.sendEmail(_partner.getPartnerEmail(), "Your partner" +
                        " registration approved.", "Welcome to Orbit Bank partner! \n " +
                        "Your partner registration has been successfully approved. You can " +
                        "start using our services with your registered email and password.\nThank you, \nTeam Orbit Bank");
            } catch (Exception e) {
                System.out.println("Mail Error : " + e );
            }
            return new ResponseEntity<>(bankRepository.save(_partner), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public List<Partner> getAllPartners() {
        return bankRepository.findAll();
    }
}
