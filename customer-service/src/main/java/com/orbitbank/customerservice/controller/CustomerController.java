package com.orbitbank.customerservice.controller;

import com.orbitbank.customerservice.model.Customer;
import com.orbitbank.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orbit/customer/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }
}
