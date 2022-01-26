package com.cis.model;

import lombok.Data;

@Data
public class Service1Request{
	private String reportType;
	private ReportCustomLabels reportCustomLabels;
	private ResellerInfo resellerInfo;
	private CustomOptions customOptions;
	private VendorData vendorData;
	private Consumerpii consumerpii;
	private PermissiblePurpose permissiblePurpose;
	private Requestor requestor;
}