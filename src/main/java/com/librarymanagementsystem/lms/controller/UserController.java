package com.librarymanagementsystem.lms.controller;

import com.librarymanagementsystem.lms.entity.Book;
import com.librarymanagementsystem.lms.entity.UserRecords;
import com.librarymanagementsystem.lms.service.UserRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserRecordService userRecordService;

    @PostMapping("/saveUser")
    public UserRecords saveUser(@RequestBody UserRecords userRecords){
        UserRecords userRecord=userRecordService.saveUserData(userRecords);
        return userRecord;
    }

    @GetMapping("/getAllUsers")
    public List<UserRecords>  getAllUserRecords(){
        return userRecordService.getAllUsersData();
    }

    @GetMapping("/getUserById{id}")
    public ResponseEntity<UserRecords> getUserRecordById(@PathVariable Long id) {
        return ResponseEntity.ok(userRecordService.getUserRecordById(id));
    }
    @PutMapping("/updateUser/{id}")
    public ResponseEntity<UserRecords> updateUserRecord(@PathVariable Long id, @RequestBody UserRecords userRecordDetails) {
        return ResponseEntity.ok(userRecordService.updateUserRecord(id, userRecordDetails));
    }

    @DeleteMapping("/deleteuser/{id}")
    public ResponseEntity<Void> deleteUserRecord(@PathVariable Long id) {
        userRecordService.deleteUserRecord(id);
        return ResponseEntity.noContent().build();
    }

}
