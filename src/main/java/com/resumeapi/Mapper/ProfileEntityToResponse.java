package com.resumeapi.Mapper;


import com.resumeapi.dto.ProfileResponseDto;
import com.resumeapi.entity.Profile;

public class ProfileEntityToResponse {

    public static ProfileResponseDto getProfileResponse(Profile profile) {
        ProfileResponseDto profileResponseDto = new ProfileResponseDto();
       profileResponseDto.setId(profile.getId());
        profileResponseDto.setName(profile.getName());
        profileResponseDto.setSummary(profile.getSummary());
        profileResponseDto.setTitle(profile.getTitle());

        if (profile.getAddress() != null) {
            profileResponseDto.setCity(profile.getAddress().getCity());
            profileResponseDto.setCountry(profile.getAddress().getCountry());
        }

        return profileResponseDto;
    }
}
