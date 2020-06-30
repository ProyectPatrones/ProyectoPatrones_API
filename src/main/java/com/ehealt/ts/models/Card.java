package com.ehealt.ts.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Card {

    @Id
    private int id;

    private int amount;

    private int cardNumber;

    private Date dateOfExpiry;

    private int postalCode;

    private String address;
}
