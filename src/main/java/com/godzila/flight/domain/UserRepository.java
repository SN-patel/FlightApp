package com.godzila.flight.domain;
import org.springframework.data.repository.CrudRepository;

import com.godzila.flight.entity.User;

public interface UserRepository extends CrudRepository<User,Integer> {
    
}
