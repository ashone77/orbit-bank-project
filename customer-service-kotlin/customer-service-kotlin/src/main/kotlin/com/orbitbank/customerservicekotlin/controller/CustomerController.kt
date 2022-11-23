package com.orbitbank.customerservicekotlin.controller

import com.orbitbank.customerservicekotlin.model.Customer
import com.orbitbank.customerservicekotlin.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/orbit/customer/")
class CustomerController {
    @Autowired
    private val customerService: CustomerService? = null
    @PostMapping("/")
    fun addCustomer(@RequestBody customer: Customer?): Customer {
        return customerService!!.saveCustomer(customer!!)
    }

    @get:GetMapping("/")
    val getAllCustomer: List<Any?>?
        get() {
            val support: List<Customer> = ArrayList<Customer>()
            return customerService?.listAllCustomers()
        }

    @GetMapping("/{id}")
    fun getCustomerById(@PathVariable("id") customerId: String?): Customer? {
        return customerService!!.getCustomerById(customerId)
    }

    @PutMapping("/{id}")
    fun updateCustomerDetails(
        @PathVariable("id") customerId: String?,
        @RequestBody customerDetails: Customer?
    ): Boolean {
        return customerService!!.updateCustomerDetails(customerId, customerDetails!!)
    }

    @PutMapping("/{id}")
    fun disableCustomerAccount(@PathVariable("id") customerId: String?): Boolean {
        return customerService!!.disableCustomerAccount(customerId)
    }
}