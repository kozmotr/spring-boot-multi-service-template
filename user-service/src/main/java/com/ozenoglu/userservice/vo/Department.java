package com.ozenoglu.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
