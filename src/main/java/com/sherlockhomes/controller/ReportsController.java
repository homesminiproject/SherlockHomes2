package com.sherlockhomes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Reports")
public class ReportsController {


    @GetMapping("Report")
    public String Report() {

        return "reports/Report";
    }
    @GetMapping("ReportInsert")
    public String ReportInsert() {

        return "reports/ReportInsert";
    }

    @GetMapping("ReportUpdate")
    public String ReportUpdate() {

        return "reports/ReportUpdate";
    }
}
