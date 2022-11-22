package com.orbitbank.partnerservice.insurance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Document(collection = "general_insurance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class GeneralInsurance {
    @Id
    @Indexed(unique = true)
    private String policyId;
    private String customerId;
    private String partnerId;

    private String vehicleType;
    private String insuranceType;

    private String customerFirstName;
    private String insuredName;
    private String insuredAddress;
    private String insuredPan;
    private String insuredAadhaar;

    private int insuredPersonAmount=1000000;
    private int thirdpartyInsuredAmount=7000000;

    private String vehicleName;
    private String chassisNo;
    private String registrationNo;
    private int engineCapacity;
    private int seatCapacity;
    private String manufactureDate;

    private Long insuredAmount;

    private String doc;
    private String dom;

    private int vehicleAge = calculateAge(LocalDate.parse(dom));

    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }

    private double premium = Math.pow((1-(10/100)),vehicleAge)
            *(10*(insuredPersonAmount+thirdpartyInsuredAmount)/100);


}
