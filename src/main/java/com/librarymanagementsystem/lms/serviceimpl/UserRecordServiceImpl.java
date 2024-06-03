package com.librarymanagementsystem.lms.serviceimpl;

import com.librarymanagementsystem.lms.entity.UserRecords;
import com.librarymanagementsystem.lms.repo.UserRecordsRepository;
import com.librarymanagementsystem.lms.service.UserRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRecordServiceImpl implements UserRecordService {
    @Autowired
    private  UserRecordsRepository userRecordsRepository;


    @Override
    public List<UserRecords> getAlluserRecords() {

        return getAlluserRecords();
    }

    @Override
    public UserRecords getUserRecordById(Long id) {
        return null;
    }

    @Override
    public UserRecords updateUserRecord(Long id, UserRecords userRecordDetails) {
        return null;
    }


    @Override
    public Object updateUserRecords(Long id, UserRecords userDetails) throws Exception{
        UserRecords user = userRecordsRepository.findById(id).orElseThrow(() -> new Exception("user not found" + id));
        user.setId(userDetails.getId());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        user.setUsername(user.getUsername());

        return userRecordsRepository.save(user);
    }

    public void deleteUserRecord(Long userId) {
        UserRecords user = userRecordsRepository.findById(userId)
                .orElseThrow();
        return ;

    }

    @Override
    public UserRecords saveUserData(UserRecords userRecords) {
        return userRecordsRepository.save(userRecords);
    }

    @Override
    public List<UserRecords> getAllUsersData() {
        return userRecordsRepository.findAll();
    }
}
