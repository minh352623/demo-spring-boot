package com.example.demo.common;

import com.example.demo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CriketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "wait a minus!!!";
    }
}
