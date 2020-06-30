package com.ehealt.ts.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class CashPayment {
    @Id
    private Integer id;
    private int amount;
    private String bankName;
}
