package com.ehealt.ts.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Subscription {
    @Id
    private Integer id;
    private String typeOfSubscription;
    private String time;
    private String paymentMethod;
}
