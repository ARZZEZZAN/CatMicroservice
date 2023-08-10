package com.arzezan.app.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CatDTO {
    private String name;
    private LocalDate birthday;
}
