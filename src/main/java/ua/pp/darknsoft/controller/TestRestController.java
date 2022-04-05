package ua.pp.darknsoft.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRestController {

    @GetMapping(value = "/hellouser")
    public String helloUser(){
        return "Hello User";
    }

    @GetMapping(value = "/helloadmin")
    public String helloAdmin(){
        return "Hello Admin";
    }
}
