package com.lexisnexi.risk.service;

import com.lexisnexi.risk.model.CompanyDetailsResponse;
import org.springframework.stereotype.Service;


public interface CompanyDetailsService {

    CompanyDetailsResponse getCompanyDetails(String Search);

    CompanyDetailsResponse getOfficersDetailsFromCompany(long companyNumber);
}
