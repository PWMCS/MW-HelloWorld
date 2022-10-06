package com.pw;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "/v1.0.0/services/getHelloMessage")
    public ResponseEntity<String> fetchAllContactUs() throws Exception {

        return ResponseEntity.ok("Hello, world... : " + new Date());

    }

}
