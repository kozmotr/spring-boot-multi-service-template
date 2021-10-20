package com.ozenoglu.userservice.service;

import com.ozenoglu.userservice.entity.User;
import com.ozenoglu.userservice.repository.UserRepository;
import com.ozenoglu.userservice.vo.Department;
import com.ozenoglu.userservice.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;


    public User save(User user) {
        log.info("userService saving user {}" , user);
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long id) {
        log.info("userService retrieving userWithDepartment for id {}",id);
        User user = userRepository.findByUserId(id);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }
}
