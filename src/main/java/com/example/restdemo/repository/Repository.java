package com.example.restdemo.repository;

import com.example.restdemo.entity.Camera;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Repository extends CrudRepository<Camera, Integer> {

    public List<Camera> findByName(String name);
    public List<Camera> findByResolution(String resolution);


}
