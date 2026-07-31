package com.easybytes.jobportal.service.impl;

import com.easybytes.jobportal.entity.Company;
import com.easybytes.jobportal.repository.CompanyRepository;
import com.easybytes.jobportal.service.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    /// @return
    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
