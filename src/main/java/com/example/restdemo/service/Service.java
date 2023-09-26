package com.example.restdemo.service;

import com.example.restdemo.entity.Camera;
import com.example.restdemo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repo;
    public List<Camera> getCameras(){
        return (List<Camera>) repo.findAll();
    }

    public void addCameras(Camera camera){
        repo.save(camera);
    }

    public Optional<Camera> getCamerasById(Integer id){
        return repo.findById(id);
    }

    public void updateCamera(Camera camera){
        repo.save(camera);
    }

    public void deleteCameraById(Integer id){
        repo.deleteById(id);
    }

    public List<Camera> getCamerasByName(String name){
        return repo.findByName(name);
    }
    public List<Camera> getCamerasByResolution(String resolution){
        return repo.findByResolution(resolution);
    }

}
