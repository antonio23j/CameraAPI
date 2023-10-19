package com.example.restdemo.service;


import com.example.restdemo.entity.Room;
import com.example.restdemo.repository.RoomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RoomService {

    @Autowired
    RoomRepository repo;

    public List<Room> getRooms(){
        return (List<Room>) repo.findAll();
    }

    public void addRoom(Room room){
        repo.save(room);
        log.info("Room added successfully");
    }
}
