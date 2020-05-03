package com.example.demosecurity.web.restapi.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String firstName;
    private String lastName;
    private Date dob;
    private String userName;
    private String emailId;
    private Long phoneNumber;
}
