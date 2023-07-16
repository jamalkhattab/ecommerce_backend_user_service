package com.khattab.usermetadata.controller;

import com.khattab.usermetadata.entity.UserMetaData;
import com.khattab.usermetadata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ecommerce/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public UserMetaData saveUserDetails(@RequestBody UserMetaData userMetaData) {
        return userService.saveUserMetaData(userMetaData);
    }

    @GetMapping("/{uniqueId}")
    public UserMetaData getUserDetails(@PathVariable String uniqueId){
        return userService.getUserMetaData(uniqueId);
    }


    @GetMapping()
    public List<UserMetaData> getUsers(){
        return userService.getUsers();
    }

}
