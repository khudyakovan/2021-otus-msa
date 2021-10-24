package ru.otus.homework.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicationHeathIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().build();
    }
}
