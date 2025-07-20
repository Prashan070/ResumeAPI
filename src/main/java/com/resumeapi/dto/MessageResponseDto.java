package com.resumeapi.dto;

import lombok.Data;

@Data
public class MessageResponseDto {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
