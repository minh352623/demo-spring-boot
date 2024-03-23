package com.example.demo.rest;

import com.example.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach ortherCoach;

    @Value("${test.name}")
    private String testName;
    private String prop;

    @Autowired
    public DemoController(@Qualifier("criketCoach") Coach coach, @Qualifier("criketCoach") Coach coach2){
        this.myCoach = coach;
        this.ortherCoach = coach2;
    }

    @GetMapping("/")
    public String sayHello( ){
        return "Hello world >> Minh" + this.testName ;
    }


    @GetMapping("/worker")
    public String worker(){
        String a = "jjj";
        return "Worker with auto reload >> Minh aaaa ----" + this.testName;
    }

    @GetMapping("coach-work")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "my Coach == orther Coach "+ (myCoach == ortherCoach);
    }

//    @Autowired
//    public void setCoach(Coach coach){
//        this.myCoach = coach;
//    }
}
