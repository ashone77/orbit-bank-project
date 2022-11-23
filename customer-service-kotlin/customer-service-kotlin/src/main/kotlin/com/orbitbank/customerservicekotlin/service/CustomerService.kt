package com.orbitbank.customerservicekotlin.service

import com.orbitbank.customerservicekotlin.model.Customer
import com.orbitbank.customerservicekotlin.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerService {
    @Autowired
    private val customerRepository: CustomerRepository? = null

    fun saveCustomer(customer: Customer): Customer {
        return customerRepository!!.save(customer)
    }

    val allCustomers: List<Customer?>
        get() = customerRepository!!.findAll()

    fun getCustomerById(customerId: String?): Customer? {
        return customerRepository!!.findByCustomerId(customerId)
    }

    fun updateCustomerDetails(customerId: String?, customerDetails: Customer): Boolean {
        val customerOptional = Optional.ofNullable(customerRepository!!.findByCustomerId(customerId))
        if (customerOptional.isPresent) {
            var _customer = Customer()
            _customer = customerOptional.get()
            _customer.setFirstName(customerDetails.getFirstName())
            _customer.setLastName(customerDetails.getLastName())
            _customer.setEmail(customerDetails.getEmail())
            _customer.setPhone(customerDetails.getPhone())
            _customer.setCity(customerDetails.getCity())
            _customer.setCountry(customerDetails.getCountry())
            _customer.setDistrict(customerDetails.getDistrict())
            _customer.setDob(customerDetails.getDob())
            _customer.setAccNo(customerDetails.getAccNo())
            _customer.setState(customerDetails.getState())
            _customer.setAadhaarNo(customerDetails.getAadhaarNo())
            _customer.setPanNo(customerDetails.getPanNo())
            _customer.setAccNo(customerDetails.getAccNo())
            customerRepository.save(_customer)
            return true
        }
        println("Error updating the customer details.")
        return false
    }

    fun disableCustomerAccount(customerId: String?): Boolean {
        val customerOptional = Optional.ofNullable(customerRepository!!.findByCustomerId(customerId))
        if (customerOptional.isPresent) {
            val _customer = customerOptional.get()
            _customer.setAccountStatus("inactive")
            customerRepository.save(_customer)
            return true
        }
        return false
    }


    fun listAllCustomers(): List<Any?>? {
        return customerRepository?.findAll()
    }


}