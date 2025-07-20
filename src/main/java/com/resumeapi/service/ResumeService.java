package com.resumeapi.service;

import com.resumeapi.dto.*;

import java.util.List;

public interface ResumeService {

   public ProfileResponseDto getProfile();

   public List<SkillResponseDto> getSkill();

   public List<ExperienceResponseDto> getExperience();

   public ContactResponseDto getContact();


   public MessageResponseDto getHire(MessageRequestDto messageRequestDto);
}
