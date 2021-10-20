package com.ozenoglu.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack() {
        return "User Service took longer time than expected please try again later.";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack() {
        return "Department Service  took longer time than expected please try again later.";
    }

}
