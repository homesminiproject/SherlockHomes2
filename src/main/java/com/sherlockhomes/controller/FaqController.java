package com.sherlockhomes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Faq")
public class FaqController {

    @GetMapping("FaQ")
    public String FaQ() {

        return "faq/FaQ";
    }

    @GetMapping("Inquiry")
    public String Inquiry() {
        return "faq/Inquiry";
    }


    @GetMapping("InquiryInsert")
    public String InquiryInsert() {
        return "faq/InquiryInsert";
    }

    @GetMapping("InquiryUpdate")
    public String InquiryUpdate() {
        return "faq/InquiryUpdate";
    }
}
