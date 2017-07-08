package com.doganmesut.crossapi.repository;

import com.doganmesut.crossapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mesut on 02.07.2017.
 */

public interface UserRepository extends MongoRepository<User, Long> {

}
