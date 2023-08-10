package com.arzezan.app.Entity;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Table
@Entity
@Data
@Accessors(chain = true)
public class Cat {
    @Id
    private String id;
    private String name;
    private LocalDate birthday;
    private LocalDateTime createdAt;
}
