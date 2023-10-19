package com.example.restdemo.controller;

import com.example.restdemo.entity.Room;
import com.example.restdemo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("room")
@RestController
public class RoomController {

    @Autowired
    RoomService service;

    @GetMapping
    public List<Room> getRooms(){
        return service.getRooms();
    }

    @PostMapping("/addRoom")
    public void addRoom(@RequestBody Room room){
        service.addRoom(room);
    }

}
