package com.ehealt.ts.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
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
