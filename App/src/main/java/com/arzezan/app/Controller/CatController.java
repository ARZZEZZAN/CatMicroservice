package com.arzezan.app.Controller;

import com.arzezan.app.DTO.CatDTO;
import com.arzezan.app.Entity.Cat;
import com.arzezan.app.Service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
public class CatController {

    private CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @PostMapping("saveCat")
    public Cat save(@RequestBody CatDTO cat) {
        return catService.save(cat);
    }
    @GetMapping("getAll")
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
