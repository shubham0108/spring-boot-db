package com.techprimer.db.springbootdb.repository;

import com.techprimer.db.springbootdb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
