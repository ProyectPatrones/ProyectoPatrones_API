package com.ehealt.ts.controller;

import com.ehealt.ts.models.User;
import com.ehealt.ts.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> findAll(){
       return userRepository.findAll();
    }

    @PostMapping
    public void Create(@RequestBody User us){
        userRepository.save(us);
    }
}
