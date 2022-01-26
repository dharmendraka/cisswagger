package com.cis.model;

import lombok.Data;

@Data
public class Service2Request {
    private Address address;
    private String applicationEndUserId;
    private String dob;
    private String email;
    private String generationCode;
    private Name fullName;
    private String phone;
    private String ssn;
}
