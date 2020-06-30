package com.ehealt.ts.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
public class User {
    @Id
    private Integer id;

    private String username;

    @Column(name = "name", length = 50)
    private String name;

    private String lastName;
}
