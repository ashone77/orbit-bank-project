package com.orbitbank.customerservicekotlin.repository

import com.orbitbank.customerservicekotlin.model.Customer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
open interface CustomerRepository : MongoRepository<Customer?, Long?> {
    fun findByCustomerId(customerId: String?): Customer?
}