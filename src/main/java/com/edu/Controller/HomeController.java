package com.edu.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Education Management System! 🎓";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running! ✅";
    }

    @GetMapping("/api/status")
    public String status() {
        return "{\"status\":\"UP\",\"message\":\"Education Management System is running successfully\"}";
    }
}
