package com.lexisnexi.risk.controller;

import com.lexisnexi.risk.model.CompanyDetailsResponse;
import com.lexisnexi.risk.service.CompanyDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TruProxyAPI/rest/Companies/v1")
public class CompanySearchController {

	private final CompanyDetailsService companyDetailsService;

	public CompanySearchController(CompanyDetailsService companyDetailsService) {
		this.companyDetailsService = companyDetailsService;
	}

	@GetMapping("/Officers")
	public ResponseEntity<CompanyDetailsResponse> getOfficers(@RequestParam long companyNumber) {
		return new ResponseEntity<>( companyDetailsService.getOfficersDetailsFromCompany(companyNumber), HttpStatus.OK);
	}
	@GetMapping("/Search")
	public ResponseEntity<CompanyDetailsResponse> getCompany(@RequestParam String search) {
		return new ResponseEntity<>( companyDetailsService.getCompanyDetails(search), HttpStatus.OK);
	}

}
