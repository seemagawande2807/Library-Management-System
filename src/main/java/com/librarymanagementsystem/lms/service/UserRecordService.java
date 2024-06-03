package com.librarymanagementsystem.lms.service;

import com.librarymanagementsystem.lms.entity.UserRecords;

import java.util.List;

public interface UserRecordService {

    

    public List<UserRecords> getAlluserRecords();



    UserRecords getUserRecordById(Long id);

    UserRecords updateUserRecord(Long id, UserRecords userRecordDetails);
    
    Object updateUserRecords(Long id, UserRecords userDetails) throws Exception;

    void deleteUserRecord(Long id);

    UserRecords saveUserData(UserRecords userRecords);

    List<UserRecords> getAllUsersData();
}
