package com.orbitbank.bankservice.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.util.Date
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Data
@NoArgsConstructor
@AllArgsConstructor
class Partner (
    @Id
    @GeneratedValue
    var id: Int,
    var partnerInsuranceCompany: String,
    var partnerName: String,
    var partnerEmail: String,
    var partnerPassword: String,
    var partnerCertification: String,
    val partnerLicenseExpiry: Date,
    var partnerPolicyCount: Int
)
