package com.mmlynarczyk.gymusers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepo userRepo;
    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable  long id){
       return ResponseEntity.of(userRepo.findById(id));
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<User> getUserDetails(@PathVariable  long id){
        userService.getUserDetails(id);
        return ResponseEntity.of(userRepo.findById(id));
    }

    @PostMapping
    public ResponseEntity<User> saveUser(User user){
       return new ResponseEntity<>(userRepo.save(user), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(User user){
       return new ResponseEntity<>(userRepo.save(user), HttpStatus.OK);
    }
}
