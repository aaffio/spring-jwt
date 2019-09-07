package com.afrianpasa.springjwt.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/private")
public class PrivateController {
    @GetMapping
    public String getMessage(@RequestHeader(required = false, name = "Authorization") String token) {
        return "Hello from private API controller";
    }
}