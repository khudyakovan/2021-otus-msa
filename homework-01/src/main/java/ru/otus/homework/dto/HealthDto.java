package ru.otus.homework.dto;

import lombok.Data;

@Data
public class HealthDto {
    private final String status;

    public HealthDto(String status){
        this.status = status;
    }
}
