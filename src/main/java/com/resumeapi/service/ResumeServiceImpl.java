package com.resumeapi.service;

import com.resumeapi.Mapper.ContactEntityToResponse;
import com.resumeapi.Mapper.ExperienceEntityToResponse;
import com.resumeapi.Mapper.ProfileEntityToResponse;
import com.resumeapi.Mapper.SkillEntityToResponse;
import com.resumeapi.dto.*;
import com.resumeapi.entity.*;
import com.resumeapi.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    private ProfileRespository profileRespository;
    private ModelMapper modelMapper;
    private SkillRepository skillRepository;
    private ExperienceRepository experienceRepository;
    private ContactRepository contactRepository;
    private MessageRepository messageRepository;

    public ResumeServiceImpl(ProfileRespository profileRespository, ModelMapper modelMapper, SkillRepository skillRepository, ExperienceRepository experienceRepository, ContactRepository contactRepository, MessageRepository messageRepository) {
        this.profileRespository = profileRespository;
        this.modelMapper = modelMapper;
        this.skillRepository = skillRepository;
        this.experienceRepository = experienceRepository;
        this.contactRepository = contactRepository;
        this.messageRepository = messageRepository;
    }

    @Override
    public ProfileResponseDto getProfile() {
        Profile profile = profileRespository.findLatestProfile();
        return ProfileEntityToResponse.getProfileResponse(profile);
    }

    @Override
    public List<SkillResponseDto> getSkill() {
        List<Skill> skills = skillRepository.findAll();
        return skills.stream().map(SkillEntityToResponse::getSkillResponse).toList();
    }

    @Override
    public List<ExperienceResponseDto> getExperience() {
        List<Experience> experiences = experienceRepository.findAll();
        return experiences.stream().map(ExperienceEntityToResponse::getExperienceResponse).toList();
    }

    @Override
    public ContactResponseDto getContact() {
        Contact contact = contactRepository.getContactDetails();
        return ContactEntityToResponse.getContactResponse(contact);
    }

    @Override
    public MessageResponseDto getHire(MessageRequestDto messageRequestDto) {
        Message message = modelMapper.map(messageRequestDto, Message.class);
        messageRepository.save(message);

        MessageResponseDto messageResponseDto = new MessageResponseDto();
        messageResponseDto.setStatus("Message received. Just say 'You're hired' already!");

        return messageResponseDto;
    }

}
