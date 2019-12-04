package com.tencorners.demospringjavamail.repositories;

import com.tencorners.demospringjavamail.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
