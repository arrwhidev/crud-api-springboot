package com.arrwhi.crudapi.web.service;

import com.arrwhi.crudapi.db.entity.User;
import com.arrwhi.crudapi.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * Created by arran on 12/02/17.
 */
@Service
public class UserService implements CrudService<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CrudRepository<User, Long> repository() {
        return userRepository;
    }
}
