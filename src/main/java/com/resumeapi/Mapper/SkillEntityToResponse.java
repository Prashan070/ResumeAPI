package com.resumeapi.Mapper;


import com.resumeapi.dto.SkillResponseDto;
import com.resumeapi.entity.Skill;

public class SkillEntityToResponse {

    public static SkillResponseDto getSkillResponse(Skill skill) {
        SkillResponseDto skillResponseDto = new SkillResponseDto();
        skillResponseDto.setId(skill.getId());
        skillResponseDto.setName(skill.getName());
        skillResponseDto.setSkillLevel(skill.getSkillLevel());
        return skillResponseDto;
    }
}
