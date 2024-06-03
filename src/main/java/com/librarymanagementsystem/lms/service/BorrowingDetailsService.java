package com.librarymanagementsystem.lms.service;

import com.librarymanagementsystem.lms.entity.BorrowingDetails;

import java.util.List;

public interface BorrowingDetailsService {


    BorrowingDetails saveBorrowingData(BorrowingDetails borrowingDetails);


    BorrowingDetails getAllBorrowingData(BorrowingDetails borrowingDetails);

    BorrowingDetails updateBorrowingData(BorrowingDetails borrowingDetails);


    void deleteBorrowingDetails(Long id);
}
