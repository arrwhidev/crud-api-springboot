package com.arrwhi.crudapi.db.repository;

import com.arrwhi.crudapi.db.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by arran on 12/02/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
