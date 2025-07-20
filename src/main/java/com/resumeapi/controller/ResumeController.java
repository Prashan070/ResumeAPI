package com.resumeapi.controller;

import com.resumeapi.dto.*;
import com.resumeapi.service.ResumeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "Resume REST API",
        description = "Designed for recruiters. Just one POST away from hiring me."
)

@RestController
@RequestMapping("/resume")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }


    @Operation(
            summary = "Fetch profile",
            description = "Rest API To fetch profile"
    )

    @GetMapping("/profile")
    public ResponseEntity<ProfileResponseDto> getProfile() {
        return new ResponseEntity<>(resumeService.getProfile(), HttpStatus.OK);
    }

    @Operation(
            summary = "Fetch skills",
            description = "Rest API To fetch skills"
    )

    @GetMapping("/skill")
    public ResponseEntity<List<SkillResponseDto>> getSkill() {
        return new ResponseEntity<>(resumeService.getSkill(), HttpStatus.OK);
    }

    @Operation(
            summary = "Fetch experience",
            description = "Rest API To fetch experiences"
    )

    @GetMapping("/experience")
    public ResponseEntity<List<ExperienceResponseDto>> getExperience() {
        return new ResponseEntity<>(resumeService.getExperience(), HttpStatus.OK);
    }

    @Operation(
            summary = "Fetch contact",
            description = "Rest API To fetch contact"
    )

    @GetMapping("/contact")
    public ResponseEntity<ContactResponseDto> getContact() {
        return new ResponseEntity<>(resumeService.getContact(), HttpStatus.OK);
    }

    @Operation(
            summary = "Create Hire Me Request",
            description = "Rest API To Hire Me Request"
    )

    @PostMapping("/contact/message")
    public ResponseEntity<MessageResponseDto> getHire(@RequestBody MessageRequestDto messageRequestDto) {
        return new ResponseEntity<>(resumeService.getHire(messageRequestDto), HttpStatus.OK);
    }


}
