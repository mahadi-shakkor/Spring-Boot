package com.easybytes.jobportal.contact.controller.impl;

import com.easybytes.jobportal.contact.controller.service.IContactService;
import com.easybytes.jobportal.dto.ContactRequestDto;
import com.easybytes.jobportal.entity.Contact;
import com.easybytes.jobportal.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements IContactService {

    private final ContactRepository contactRepository;


    /// @param contactRequestDto
    /// @return
    @Override
    public boolean saveContactMessage(ContactRequestDto contactRequestDto) {
        boolean result = false;

        Contact contact=contactRepository.save(transferToContact(contactRequestDto));
        if (contact != null && contact.getId() != null) {
            result = true;
        }
        return result;


    }

    private Contact transferToContact(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact);
        contact.setCreatedAt(Instant.now());
        contact.setCreatedBy("System");
        contact.setStatus("Activee");
        System.out.println(contact.toString());



        return contact;
    }
}
