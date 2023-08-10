package com.arzezan.app.Service;

import com.arzezan.app.DTO.CatDTO;
import com.arzezan.app.Entity.Cat;
import com.arzezan.app.Repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatService {

    private CatRepository catRepository;

    @Autowired
    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository
    }

    public Cat save(CatDTO catDTO) {
        return catRepository.save(catDTO);
    }
    public Iterable<Cat> getAll() {

    }
}
