package com.arzezan.app.Controller;

import com.arzezan.app.DTO.CatDTO;
import com.arzezan.app.Entity.Cat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cats")
public class CatController {
    @PostMapping
    public Cat save(CatDTO cat) {
        return new Cat();
    }
}
