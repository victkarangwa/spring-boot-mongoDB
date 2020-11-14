package com.example.springbootmongo.resource;

import com.example.springbootmongo.document.Users;
import com.example.springbootmongo.repository.UsersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
    private UsersRepository usersRepository;

    public UsersResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody Users users){
         usersRepository.save(users);
    }
}
