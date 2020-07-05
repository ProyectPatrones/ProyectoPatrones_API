package com.ehealt.ts.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class News  {
    @Id
    private int id;

    private String topic;

    private String filter;




}
