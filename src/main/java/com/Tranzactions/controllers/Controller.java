package com.Tranzactions.controllers;

import com.Tranzactions.Entity.Tempo;
import com.Tranzactions.Entity.User;
import com.Tranzactions.services.TempoService;
import com.Tranzactions.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    TempoService tempoService;
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @PostMapping(path="/addTempo",consumes="application/json")
    public void addTempo(@RequestBody Tempo tempo)
    {
        tempoService.addTempo(tempo);
    }
    @PostMapping(path="/addUser",consumes="application/json")
    public void addUser(@RequestBody User u)
    {
        userService.addUser(u);
    }


}