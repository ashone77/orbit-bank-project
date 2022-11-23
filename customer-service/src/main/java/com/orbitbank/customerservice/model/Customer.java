package com.orbitbank.customerservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @Indexed(unique = true)
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dob;
    private String city;
    private String district;
    private String state;
    private String country;
    private String panNo;
    private String aadhaarNo;
    private String accNo;
    private String accountStatus="active";


}
