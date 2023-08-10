package com.arzezan.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table
@Entity
@Data
public class Cat {
    @Id
    private String id;
    private String name;
    private LocalDate birthday;
    private LocalDateTime createdAt;
}