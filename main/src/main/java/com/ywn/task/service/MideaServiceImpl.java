package com.ywn.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ywn.task.Strategy;

@RestController
public class MideaServiceImpl implements MediaService {

    private Strategy mediaLib;
    
    @Autowired
    void setStrategy(Strategy stra) {
        this.mediaLib = stra;
    }

    @Override
    public ResponseEntity<String> play(String file) {
        return new ResponseEntity<String>(mediaLib.play(file), HttpStatus.OK);
    }

}
