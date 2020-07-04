package com.ehealt.ts.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
public class UserControlResponse {
    private Integer user;
    private Integer control;
}
