package com.easybytes.jobportal.contact.controller;


import com.easybytes.jobportal.contact.controller.service.IContactService;
import com.easybytes.jobportal.dto.ContactRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactController {

    private final IContactService contactService;

    @PostMapping(version ="1.0" )
    public ResponseEntity<String> saveContactMessage(@RequestBody ContactRequestDto contactRequestDto) {
//       boolean result= contactService.saveContactMessage(contactRequestDto);
//        return result ? ResponseEntity.status(HttpStatus.CREATED).body("Req processed Successfully")
//                : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Req processed Failed");

        throw new RuntimeException("It is a bad day");

        

    }
}
