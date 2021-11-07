package ru.otus.homework.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.otus.homework.entity.User;
import ru.otus.homework.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;
    private static final String URI = "/api/v1/users";

    //C - Create
    @PostMapping(URI)
    public User create(@RequestBody User user){
        return  userService.save(user);
    }

    //R - Read
    @GetMapping(path = URI + "/{id}")
    public User read(@PathVariable("id") long id){
        return userService.findUserById(id);
    }

    @GetMapping(URI)
    public List<User> getUsers(){
        return userService.findAll();
    }

    //U - Update
    @PutMapping(URI)
    public User update(@PathVariable("id") long id){
        return userService.findUserById(id);
    }

    //D - Delete
    @DeleteMapping(path = URI + "/{id}")
    public void delete(@PathVariable("id") long id){
        userService.deleteById(id);
    }
}
