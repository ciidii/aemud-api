package com.amud.io.aemudapi.repositories;

import com.amud.io.aemudapi.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
