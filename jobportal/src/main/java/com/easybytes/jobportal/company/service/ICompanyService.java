package com.easybytes.jobportal.company.service;

import com.easybytes.jobportal.dto.CompanyDto;
import com.easybytes.jobportal.entity.Company;

import java.util.List;

public interface ICompanyService {

    List<CompanyDto> getAllCompanies();


}
