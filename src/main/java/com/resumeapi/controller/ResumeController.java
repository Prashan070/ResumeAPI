package com.resumeapi.controller;

import com.resumeapi.dto.*;
import com.resumeapi.service.ResumeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }


    @GetMapping("/profile")
    public ResponseEntity<ProfileResponseDto> getProfile() {
        return new ResponseEntity<>(resumeService.getProfile(), HttpStatus.OK);
    }


    @GetMapping("/skill")
    public ResponseEntity<List<SkillResponseDto>> getSkill() {
        return new ResponseEntity<>(resumeService.getSkill(), HttpStatus.OK);
    }


    @GetMapping("/experience")
    public ResponseEntity<List<ExperienceResponseDto>> getExperience() {
        return new ResponseEntity<>(resumeService.getExperience(), HttpStatus.OK);
    }

    @GetMapping("/contact")
    public ResponseEntity<ContactResponseDto> getContact() {
        return new ResponseEntity<>(resumeService.getContact(), HttpStatus.OK);
    }

    @PostMapping("/contact/message")
    public ResponseEntity<MessageResponseDto> getHire(@RequestBody MessageRequestDto messageRequestDto) {
        return new ResponseEntity<>(resumeService.getHire(messageRequestDto), HttpStatus.OK);
    }


}
