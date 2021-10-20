package com.ozenoglu.departmentservice.contoller;

import com.ozenoglu.departmentservice.entity.Department;
import com.ozenoglu.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.save(department);
    }

    @GetMapping(value = "/{id}")
    public Department getDepartmentById(@PathVariable long id) {
        return departmentService.getDepartmentById(id);
    }
}
