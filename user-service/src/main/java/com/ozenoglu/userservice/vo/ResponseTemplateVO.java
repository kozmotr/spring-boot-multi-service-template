package com.ozenoglu.userservice.vo;

import com.ozenoglu.userservice.entity.User;
import lombok.Data;


@Data
public class ResponseTemplateVO {

    User user;
    Department department;
}
