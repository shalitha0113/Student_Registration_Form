package edu.icet.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String gender;
    private String address;
    private String telNo;
    private String batch;
}
