package com.ehealt.ts.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
@Entity
public class Reminder {
    @Id
    private int id;
    private String frecuency;
    private String notification;
    private String hour;
    private String date;
}
