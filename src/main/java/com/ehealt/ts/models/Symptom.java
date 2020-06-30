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
public class Symptom {
    @Id
    private Integer id;
    private String symptomName;
    private String description;
}
