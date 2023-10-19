package com.example.restdemo.repository;

import com.example.restdemo.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Integer> {

}
