package com.orbitbank.customerservice.controller;

import com.orbitbank.customerservice.model.Customer;
import com.orbitbank.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orbit/customer/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") String customerId){
        return customerService.getCustomerById(customerId);
    }

    @PutMapping("/{id}")
    public Boolean updateCustomerDetails(@PathVariable("id") String customerId,@RequestBody Customer customerDetails){
        return customerService.updateCustomerDetails(customerId,customerDetails);
    }

    @PutMapping("/{id}")
    public Boolean disableCustomerAccount(@PathVariable("id") String customerId){
        return customerService.disableCustomerAccount(customerId);
    }

}
