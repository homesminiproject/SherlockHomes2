package com.sherlockhomes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Maps")
public class MapsController {

    @GetMapping("/Apt")
    public String Apt() {
        return "maps/Apt";
    }
    @GetMapping("/Officetel")
    public String Officetel(){
        return "maps/Officetel";
    }
    @GetMapping("/Villa")
    public String Villa(){
        return "maps/Villa";
    }


}
