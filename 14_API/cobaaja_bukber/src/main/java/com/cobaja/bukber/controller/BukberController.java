package com.cobaja.bukber.controller;

import com.cobaja.bukber.model.Users;
import com.cobaja.bukber.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller  - Jembatan untuk ke URL API
// Getmap untuk anotasi dengan method get (mendapatkan data)
 @RestController

public class BukberController {
     @Autowired
     private UsersService usersService;

     @GetMapping("GET/v1/messages") // method API
    public String hello() {
         return "Hello World";
     }
     @PostMapping("POST/v1/messages")
     public String helloPost() {

         return "Hello World Post";
     }
     @DeleteMapping("DELETE/v1/messages")
     public String helloDelete() {
         return "Hello World Delete";
     }

     @GetMapping("/v2/nampilin")
    public List <Users> preview(){
         return usersService.usersList();
     }
     @GetMapping("/v3/Gender/{gender}")
    public List <Users> gender(@PathVariable String gender){
         return usersService.genderKelamin(gender);

     }
    @GetMapping("/v3/Gender")
    public List <Users> kelamin(@RequestBody Users gender){
        return usersService.genderKelamin(gender.getGender());
    }





}
