package com.lexisnexi.risk.service;

import com.lexisnexi.risk.model.Address;
import com.lexisnexi.risk.model.CompanyDetailsResponse;
import com.lexisnexi.risk.model.Item;
import com.lexisnexi.risk.model.Officer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService {
    @Override
    public CompanyDetailsResponse getCompanyDetails(String Search) {

        return getCompanyDetailsResponse();
    }

    @Override
    public CompanyDetailsResponse getOfficersDetailsFromCompany(long companyNumber) {

        return getCompanyDetailsResponse();
    }


    private CompanyDetailsResponse getCompanyDetailsResponse() {
        CompanyDetailsResponse companyDetailsResponse = new CompanyDetailsResponse();
        companyDetailsResponse.setTotal_results(getItems().size());
        companyDetailsResponse.setItems(getItems());
        return companyDetailsResponse;
    }


    private List<Item> getItems() {

        return Arrays.asList(getItem());

    }

    private Item getItem() {
        Item item = new Item();
        item.setCompany_number("1234");
        item.setCompany_status("Active");
        item.setCompany_type("IT");
        item.setTitle("ABC Ltd");
        item.setOfficers(getOfficers());
        item.setAddress(getCompanyAddress());
        return item;
    }


    private List<Officer> getOfficers() {
        Officer officer = new Officer();
        officer.setName("John Smith");
        officer.setAppointed_on("12-06-2022");
        officer.setOfficer_role("Director");
        officer.setAddress(getOfficerAddress());
        return Arrays.asList(officer);
    }

    private Address getOfficerAddress() {
        Address officerAddress = new Address();
        officerAddress.setAddress_line_1("1");
        officerAddress.setPremises("");
        officerAddress.setLocality("Liverpool Street");
        officerAddress.setCountry("UK");
        officerAddress.setPostal_code("EC6 9PF");
        return officerAddress;

    }

    private Address getCompanyAddress() {
        Address companyAddress = new Address();
        companyAddress.setAddress_line_1("10");
        companyAddress.setPremises("");
        companyAddress.setLocality("Manchester Street");
        companyAddress.setCountry("UK");
        companyAddress.setPostal_code("EC1 9PF");
        return companyAddress;

    }
}
