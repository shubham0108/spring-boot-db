package com.techprimer.db.springbootdb.repository;

import com.techprimer.db.springbootdb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
  @Query(value =  "select id from users where id>?3", nativeQuery = true)
  List<Users> findAllById(@Param("id") Integer id);
}
