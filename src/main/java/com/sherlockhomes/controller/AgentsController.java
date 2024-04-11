package com.sherlockhomes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Agents")
public class AgentsController {


    @GetMapping("AgentInsert")
    public String AgentInsert() {
        return "agents/AgentInsert";
    }


    @GetMapping("AgenLogin")
    public String AgentLogin() {
        return "agents/AgentLogin";
    }
}
