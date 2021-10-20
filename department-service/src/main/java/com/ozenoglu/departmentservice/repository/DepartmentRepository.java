package com.ozenoglu.departmentservice.repository;

import com.ozenoglu.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department , Long> {
    Department findByDepartmentId(long departmentId);
}
