package com.easybytes.jobportal.company.service.impl;

import com.easybytes.jobportal.dto.CompanyDto;
import com.easybytes.jobportal.entity.Company;
import com.easybytes.jobportal.repository.CompanyRepository;
import com.easybytes.jobportal.company.service.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    /// @return
    @Override
    public List<CompanyDto> getAllCompanies() {
        return companyRepository.findAll().stream().map(this::transformToDto).collect(Collectors.toList());
    }

    private CompanyDto transformToDto(Company company) {
        return new CompanyDto(
                company.getId(),
                company.getName(),
                company.getLogo(),
                company.getIndustry(),
                company.getSize(),
                company.getRating(),
                company.getLocations(),
                company.getFounded(),
                company.getDescription(),
                company.getEmployees(),
                company.getWebsite(),
                company.getCreatedAt()
        );
    }
}
