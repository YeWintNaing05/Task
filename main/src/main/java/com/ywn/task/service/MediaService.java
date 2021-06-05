package com.ywn.task.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface MediaService {

    @GetMapping("api/play")
    ResponseEntity<String> play(@RequestParam("file") String file);

}
