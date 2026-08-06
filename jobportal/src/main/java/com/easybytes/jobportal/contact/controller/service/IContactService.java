package com.easybytes.jobportal.contact.controller.service;

import com.easybytes.jobportal.dto.ContactRequestDto;

public interface IContactService {

    boolean saveContactMessage(ContactRequestDto contactRequestDto);
}
