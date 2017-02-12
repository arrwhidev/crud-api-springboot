package com.arrwhi.crudapi.web.controller;

import com.arrwhi.crudapi.db.entity.User;
import com.arrwhi.crudapi.web.service.CrudService;
import com.arrwhi.crudapi.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController implements CrudController<User> {

    @Autowired
    UserService userService;

    @Override
    public CrudService<User> service() {
        return userService;
    }
}
