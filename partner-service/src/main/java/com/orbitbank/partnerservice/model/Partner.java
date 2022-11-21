package com.orbitbank.partnerservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "partner")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class Partner {
    @Id
    @Indexed(unique = true)
    private String partnerId;
    private String partnerUsername;
    private String partnerPassword;
    private String partnerFirstName;
    private String partnerLastName;
    private String partnerEmail;
    private String partnerInsuranceCompany;
    private String partnerSellerLicenceNo;
    private String partnerLicenseExpiry;
    private String partnerDOB;
    private String partnerPhone;
    private String partnerCity;
    private String partnerDistrict;
    private String partnerState;
    private String partnerCountry;
    private String partnerPinCode;
    private Boolean autorized=false;
}
