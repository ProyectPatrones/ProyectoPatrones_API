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
public class Doctor {
    @Id
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String password;
}
