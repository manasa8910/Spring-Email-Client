package com.example.springEmailClient.controller;

import com.example.springEmailClient.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailSenderService service;

    //	@EventListener(ApplicationReadyEvent.class)
    @GetMapping("/send")
    public String send(){
        service.sendSimpleEmail("catscratchthat@gmail.com",
                "Hey, this is spring boot sedning email","automated mail");
        return "sent";
    }
}
