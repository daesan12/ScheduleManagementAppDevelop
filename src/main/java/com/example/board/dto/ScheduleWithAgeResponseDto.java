package com.example.board.dto;

import lombok.Getter;

@Getter
public class ScheduleWithAgeResponseDto {
    private final String title;
    private final String contents;
    private final  String email;

    public ScheduleWithAgeResponseDto(String title, String contents, String email) {
        this.title = title;
        this.contents = contents;
        this.email = email;
    }
}