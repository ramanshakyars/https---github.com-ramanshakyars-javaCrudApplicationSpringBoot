package com.example.CustumerApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Custumar {
     @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     private String name;
     private String email;
     private Long mobile;
     private String gender;
     private Date dob;
     private String address;
    private Boolean deleted = false;
}
