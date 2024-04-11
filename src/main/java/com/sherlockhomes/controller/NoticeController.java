package com.sherlockhomes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Notice")
public class NoticeController {


    @GetMapping("Notice")
    public String Notice() {
        return "notice/Notice";
    }
}
