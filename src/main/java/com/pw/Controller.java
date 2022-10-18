package com.pw;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping(value = "/v1.0.0/services/getHelloMessage", produces = { MediaType.TEXT_HTML_VALUE })
    public String fetchAllContactUs() throws Exception {

        return "Hello, world... : " + new Date();

    }

}
