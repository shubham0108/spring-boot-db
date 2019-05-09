package com.techprimer.db.springbootdb.resource;

import com.techprimer.db.springbootdb.model.Users;
import com.techprimer.db.springbootdb.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public static List<Users> getAll() {
        return usersRepository.findAll();
    }

    @GetMapping(value = "/id/{id}")
    public static List<Users> getId(@PathVariable Integer id){
        return usersRepository.findAllById(id);
    }
    
    @PostMapping(value = "/load")
    public static List<Users> persist(@RequestBody final Users users) {
        usersRepository.save(users);
        return usersRepository.findAll();
    }

}
