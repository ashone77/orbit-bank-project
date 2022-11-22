package com.orbitbank.customerservice.service;

import com.orbitbank.customerservice.model.Customer;
import com.orbitbank.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(String customerId) {
        return customerRepository.findByCustomerId(customerId);
    }

    public Boolean updateCustomerDetails(String customerId, Customer customerDetails) {
        Optional<Customer> customerOptional = Optional.ofNullable(customerRepository.findByCustomerId(customerId));
        if(customerOptional.isPresent()){
            Customer _customer = new Customer();
            _customer = customerOptional.get();
            _customer.setFirstName(customerDetails.getFirstName());
            _customer.setLastName(customerDetails.getLastName());
            _customer.setEmail(customerDetails.getEmail());
            _customer.setPhone(customerDetails.getPhone());
            _customer.setCity(customerDetails.getCity());
            _customer.setCountry(customerDetails.getCountry());
            _customer.setDistrict(customerDetails.getDistrict());
            _customer.setDob(customerDetails.getDob());
            _customer.setAccNo(customerDetails.getAccNo());
            _customer.setState(customerDetails.getState());
            _customer.setAadhaarNo(customerDetails.getAadhaarNo());
            _customer.setPanNo(customerDetails.getPanNo());
            _customer.setAccNo(customerDetails.getAccNo());
            customerRepository.save(_customer);
            return true;
        }
        System.out.println("Error updating the customer details.");
        return false;
    }

    public Boolean disableCustomerAccount(String customerId) {
        Optional<Customer> customerOptional = Optional.ofNullable(customerRepository.findByCustomerId(customerId));
        if(customerOptional.isPresent()){
            Customer _customer = customerOptional.get();
            _customer.setAccountStatus("inactive");
            customerRepository.save(_customer);
            return true;
        }
        return false;
    }
}
