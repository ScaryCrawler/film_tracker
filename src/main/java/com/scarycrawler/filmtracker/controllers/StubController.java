package com.scarycrawler.filmtracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StubController {
    @GetMapping("")
    public String stub() {
        return "Stub Controller for Swagger E2E check";
    }
}
