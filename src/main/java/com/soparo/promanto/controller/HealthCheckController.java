package com.soparo.promanto.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/v2.0/healthCheck")
public class HealthCheckController {

    /**
     * Get all users list.
     *
     * @return the list
     */
    @GetMapping("")
    public ResponseEntity<String> getCurrentSeverDateTime() {
        return new ResponseEntity<>("Service is up at " + Instant.now(), HttpStatus.OK);
    }

}
