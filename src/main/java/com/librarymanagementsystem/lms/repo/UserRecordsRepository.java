package com.librarymanagementsystem.lms.repo;

import com.librarymanagementsystem.lms.entity.UserRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRecordsRepository extends JpaRepository<UserRecords,Long> {
}
