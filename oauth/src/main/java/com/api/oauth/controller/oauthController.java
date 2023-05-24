package com.api.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class oauthController {
 
    @GetMapping("/home")
    public String home(){
        return "Aooba";
    }

    @GetMapping("/security")
    public String security(){
        return "aoba seguro";
    }

    @PostMapping("/webhook")
    public String webhook( @RequestBody String webrook){
        return "asd";
    }

}
