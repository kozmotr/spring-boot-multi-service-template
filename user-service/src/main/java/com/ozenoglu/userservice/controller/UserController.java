package com.ozenoglu.userservice.controller;


import com.ozenoglu.userservice.entity.User;
import com.ozenoglu.userservice.service.UserService;
import com.ozenoglu.userservice.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/")
    public User saveUser(@RequestBody User user) {
        log.info("saving user {}" , user);
        return userService.save(user);
    }

    @GetMapping(value = "/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable Long id) {
        log.info("retrieving user with id {}" , id);
        return userService.getUserWithDepartment(id);
    }
}
