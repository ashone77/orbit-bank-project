package com.orbitbank.customerservicekotlin.model

import lombok.*
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "customer")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
class Customer {
    @Id
    @Indexed(unique = true)
    private val customerId: String? = null
    private var firstName: String? = null
    private var lastName: String? = null
    private var email: String? = null
    private var phone: String? = null
    private var dob: String? = null
    private var city: String? = null
    private var district: String? = null
    private var state: String? = null
    private var country: String? = null
    private var panNo: String? = null
    private var aadhaarNo: String? = null
    private var accNo: String? = null
    private var accountStatus = "active"

    fun getFirstName(): String? {
        return firstName
    }

    fun setFirstName(firstName: String?) {
        this.firstName = firstName
    }

    fun getLastName(): String? {
        return lastName
    }

    fun setLastName(lastName: String?) {
        this.lastName = lastName
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String?) {
        this.email = email
    }

    fun getPhone(): String? {
        return phone
    }

    fun setPhone(phone: String?) {
        this.phone = phone
    }

    fun getDob(): String? {
        return dob
    }

    fun setDob(dob: String?) {
        this.dob = dob
    }

    fun getCity(): String? {
        return city
    }

    fun setCity(city: String?) {
        this.city = city
    }

    fun getDistrict(): String? {
        return district
    }

    fun setDistrict(district: String?) {
        this.district = district
    }

    fun getState(): String? {
        return state
    }

    fun setState(state: String?) {
        this.state = state
    }

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String?) {
        this.country = country
    }

    fun getPanNo(): String? {
        return panNo
    }

    fun setPanNo(panNo: String?) {
        this.panNo = panNo
    }

    fun getAadhaarNo(): String? {
        return aadhaarNo
    }

    fun setAadhaarNo(aadhaarNo: String?) {
        this.aadhaarNo = aadhaarNo
    }

    fun getAccNo(): String? {
        return accNo
    }

    fun setAccNo(accNo: String?) {
        this.accNo = accNo
    }

    fun getAccountStatus(): String? {
        return accountStatus
    }

    fun setAccountStatus(accountStatus: String?) {
        this.accountStatus = accountStatus!!
    }
}