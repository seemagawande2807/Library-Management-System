package com.librarymanagementsystem.lms.serviceimpl;

import com.librarymanagementsystem.lms.entity.Book;
import com.librarymanagementsystem.lms.entity.BorrowingDetails;
import com.librarymanagementsystem.lms.entity.UserRecords;
import com.librarymanagementsystem.lms.repo.BorrowingDetailsRepository;
import com.librarymanagementsystem.lms.service.BorrowingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowingDetailsServiceImpl implements BorrowingDetailsService {
    @Autowired
    private BorrowingDetailsRepository borrowingDetailsRepository;

    @Override
    public BorrowingDetails saveBorrowingData(BorrowingDetails borrowingDetails) {
        return borrowingDetailsRepository.save(borrowingDetails);
    }

    @Override
    public BorrowingDetails getAllBorrowingData(BorrowingDetails borrowingDetails) {
        return (BorrowingDetails) borrowingDetailsRepository.findAll();
    }

    @Override
    public BorrowingDetails updateBorrowingData(BorrowingDetails borrowingDetails) {
        BorrowingDetails bD= new BorrowingDetails();
        bD.setBorrowDate(borrowingDetails.getBorrowDate());
        bD.setId(borrowingDetails.getId());
        bD.setDueDate(borrowingDetails.getDueDate());
        bD.setStatus(borrowingDetails.getStatus());
        bD.setReturnDate(borrowingDetails.getReturnDate());
        bD.setFinesAccrued(borrowingDetails.getFinesAccrued());
        UserRecords userRecords= new UserRecords();
        userRecords.setId(borrowingDetails.getId());
        Book book =new Book();
        book.setId(borrowingDetails.getId());

        return borrowingDetailsRepository.save(borrowingDetails);
    }

    @Override
    public void deleteBorrowingDetails(Long id) {
        borrowingDetailsRepository.deleteById(id);
    }

}
