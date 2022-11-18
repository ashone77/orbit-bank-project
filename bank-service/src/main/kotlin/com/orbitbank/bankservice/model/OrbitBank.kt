package com.orbitbank.bankservice.model

import lombok.Data
import javax.persistence.Id

@Data
class OrbitBank {

    @Id
    var id: Int = 0
}