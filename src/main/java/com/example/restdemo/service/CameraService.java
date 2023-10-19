package com.example.restdemo.service;

import com.example.restdemo.entity.Camera;
import com.example.restdemo.repository.CameraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@Slf4j
public class CameraService {

    @Autowired
    CameraRepository repo;
    public List<Camera> getCameras(){
        return (List<Camera>) repo.findAll();
    }

    public void addCameras(Camera camera){
        repo.save(camera);
        log.info("Camera added successfully");
    }

    public Optional<Camera> getCamerasById(Integer id){
        return repo.findById(id);
    }

    public void updateCamera(Camera camera){
        repo.save(camera);
        log.info("Camera updated successfully");
    }

    public void deleteCameraById(Integer id){
        repo.deleteById(id);
        log.info("Camera deleted successfully");
    }

    public List<Camera> getCamerasByName(String name){
        return repo.findByName(name);
    }
    public List<Camera> getCamerasByResolution(String resolution){
        return repo.findByResolution(resolution);
    }

}
