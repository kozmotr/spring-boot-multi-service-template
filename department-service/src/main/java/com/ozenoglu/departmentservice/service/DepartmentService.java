package com.ozenoglu.departmentservice.service;

import com.ozenoglu.departmentservice.entity.Department;
import com.ozenoglu.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department save(Department department) {
        log.info("saving department {}" , department);
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(long id) {
        log.info("DepartmentService getting Department with id {}" , id);
        return departmentRepository.findByDepartmentId(id);
    }
}
