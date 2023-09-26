package com.example.restdemo.controller;

import com.example.restdemo.entity.Camera;
import com.example.restdemo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping
    public List<Camera> getCameras(){
        return service.getCameras();
    }

    @GetMapping("/getById")
    public Optional<Camera> getCamerasById(@RequestParam Integer id){
        return service.getCamerasById(id);
    }

    @GetMapping("/getByName")
    public List<Camera> getCamerasByName(@RequestParam String name){
        return service.getCamerasByName(name);
    }

    @GetMapping("/getByResolution")
    public List<Camera> getCamerasByResolution(@RequestParam String resolution){
        return service.getCamerasByResolution(resolution);
    }


    @PostMapping("/addCamera")
    public void addCamera(@RequestBody Camera camera){
        service.addCameras(camera);
    }


    @PutMapping("/updateCamera")
    public void updateCamera(@RequestBody Camera camera){
        service.updateCamera(camera);
    }


    @DeleteMapping("/deleteCamera")
    public void deleteCameraById(@RequestParam Integer id){
        service.deleteCameraById(id);
    }





}
