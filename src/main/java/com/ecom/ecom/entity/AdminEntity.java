package com.ecom.ecom.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class AdminEntity {
    @Id
    private Long adminId;
    private String adminName;
    private String adminEmail;


}