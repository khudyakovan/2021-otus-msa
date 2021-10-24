package ru.otus.homework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.homework.dto.HealthDto;

@RestController
@RequiredArgsConstructor
public class CustomHealthService {


    @GetMapping("/health")
    public HealthDto getHealth(){
        return new HealthDto("OK");
    }
}
