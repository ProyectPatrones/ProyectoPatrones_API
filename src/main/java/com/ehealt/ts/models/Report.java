package com.ehealt.ts.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
public class Report {
    @Id
    private String Tipo;
    private int Total;

}
