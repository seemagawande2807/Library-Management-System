package com.librarymanagementsystem.lms.repo;

import com.librarymanagementsystem.lms.entity.BorrowingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingDetailsRepository extends JpaRepository<BorrowingDetails,Long> {
}
