package com.cis.model;

import java.util.List;
import lombok.Data;

@Data
public class ApplicantInformation{
	private List<PhoneItem> phone;
	private Dob dob;
	private Name name;
	private Ssn ssn;
	private CurrentAddress currentAddress;
}