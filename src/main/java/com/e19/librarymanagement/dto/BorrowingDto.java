package com.e19.librarymanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BorrowingDto {
    private Integer borrowingId;
    private String userEmail;
    private String bookTitle;
    private String borrowedDate;
    private String dueDate;

}
