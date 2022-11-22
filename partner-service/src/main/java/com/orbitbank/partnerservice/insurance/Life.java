package com.orbitbank.partnerservice.insurance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Document(collection = "life_insurance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class Life {
    @Id
    @Indexed(unique = true)
    private String policyId;
    private String customerId;
    private String partnerId;

    private String insuranceType="health";

    private String customerFirstName;
    private String insuredName;
    private String insuredAddress;
    private String insuredPan;
    private String insuredAadhaar;

    private String insuredDob;
    private int insuredAge = calculateAge(LocalDate.parse(insuredDob));

    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }

    private int insuredAmount;
    private int premium;
}
