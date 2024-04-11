package com.sherlockhomes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Users")
public class UsersController {

    @GetMapping("/UserLogin")
    public String UserLogin() {

        return "users/UserLogin";
    }

    @GetMapping("/Favorite")
        public String Favorite() {

        return "users/Favorite";
    }

    @GetMapping("/UserUpdate")
        public String UserUpdate() {

        return "users/UserUpdate";
    }

    @GetMapping("/Logout")
        public String Logout() {

        return "index";
    }
}
