package com.ehealt.ts.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PaymentMethod {
    @Id
    private Integer id;
    private String typeOfPayment;
}
