package com.librarymanagementsystem.lms.controller;

import com.librarymanagementsystem.lms.entity.BorrowingDetails;
import com.librarymanagementsystem.lms.entity.UserRecords;
import com.librarymanagementsystem.lms.service.BorrowingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Controller")
public class BorrowingDetailController {
    @Autowired
    private BorrowingDetailsService borrowingDetailsService;
    @PostMapping("/saveBorrowingDetails")
    public BorrowingDetails saveBorrowingDetails(@RequestBody BorrowingDetails borrowingDetails){
       BorrowingDetails borrowingDetail= borrowingDetailsService.saveBorrowingData(borrowingDetails);
        return borrowingDetail;
    }
   @GetMapping("/getBorrowingDetail")
    public BorrowingDetails getAllBorrowingDetails(@RequestBody BorrowingDetails borrowingDetails){
        BorrowingDetails borrowingDetail= borrowingDetailsService.getAllBorrowingData(borrowingDetails);
        return borrowingDetail;
    }
    @PutMapping("/updateBorrowingDetail")
    public BorrowingDetails updateBorrwingDetails(@RequestBody BorrowingDetails borrowingDetails){
        BorrowingDetails borrowingDetail =borrowingDetailsService.updateBorrowingData(borrowingDetails);
        return borrowingDetail;
    }
    @DeleteMapping("/deleteBorrowingDetails")
    public ResponseEntity<Void> deleteBorrowingDetails(@PathVariable Long id) {
        borrowingDetailsService.deleteBorrowingDetails(id);
        return ResponseEntity.noContent().build();
    }

}
