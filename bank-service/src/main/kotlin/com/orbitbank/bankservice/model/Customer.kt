package com.orbitbank.bankservice.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.util.Date
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Data
@AllArgsConstructor
@NoArgsConstructor
class Customer (
    @Id
    @GeneratedValue
    var id: Int,
    var FirstName: String,
    var LastName: String,
    var DOB: Date,
    var City: String,
    var District: String,
    var State: String,
    var Country: String,
    var PanNo: String,
    var AadhaarNo: Long,
    var BankAcc: Long,
)