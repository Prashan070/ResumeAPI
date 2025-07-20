package com.resumeapi.Mapper;

import com.resumeapi.dto.ContactResponseDto;
import com.resumeapi.entity.Contact;

public class ContactEntityToResponse {

    public static ContactResponseDto getContactResponse(Contact contact) {
        ContactResponseDto contactResponseDto = new ContactResponseDto();
        contactResponseDto.setId(contact.getId());
        contactResponseDto.setEmail(contact.getEmail());
        contactResponseDto.setLinkedin(contact.getLinkedin());
        contactResponseDto.setGithub(contact.getGithub());
        contactResponseDto.setPhoneNumber(contact.getPhoneNumber());
        return contactResponseDto;

    }
}
