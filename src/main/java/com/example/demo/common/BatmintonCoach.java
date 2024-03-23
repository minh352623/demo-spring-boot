package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BatmintonCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "Batminton wait a minus";
    }
}
