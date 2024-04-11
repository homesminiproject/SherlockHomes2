package com.sherlockhomes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Rooms")
public class RoomsContoller {

    @GetMapping("Room")
    public String Room() {

        return "rooms/Room";
    }

    @GetMapping("RoomInsert")
    public String RoomInsert() {

        return "rooms/RoomInsert";
    }

    @GetMapping("RoomUpdate")
    public String RoomUpdate() {

        return "rooms/RoomUpdate";
    }
}
