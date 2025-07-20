package com.resumeapi.Mapper;

import com.resumeapi.dto.ExperienceResponseDto;
import com.resumeapi.entity.Experience;


public class ExperienceEntityToResponse {


    public static ExperienceResponseDto getExperienceResponse(Experience experience) {
        ExperienceResponseDto experienceResponseDto = new ExperienceResponseDto();
        experienceResponseDto.setId(experience.getId());
        experienceResponseDto.setCompany(experience.getCompany());
        experienceResponseDto.setPosition(experience.getPosition());
        experienceResponseDto.setStartDate(experience.getStartDate());
        experienceResponseDto.setEndDate(experience.getEndDate());
        return experienceResponseDto;
    }
}
