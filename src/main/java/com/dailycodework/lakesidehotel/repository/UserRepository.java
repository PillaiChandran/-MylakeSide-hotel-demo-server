package com.dailycodework.lakesidehotel.repository;

import com.dailycodework.lakesidehotel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Chandran Pillai
 */

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

   Optional<User> findByEmail(String email);
}
