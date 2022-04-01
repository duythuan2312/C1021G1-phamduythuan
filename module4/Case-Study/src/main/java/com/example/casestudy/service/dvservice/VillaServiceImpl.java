package com.example.casestudy.service.dvservice;


import com.example.casestudy.model.service.Villa;
import com.example.casestudy.repository.VillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VillaServiceImpl implements IVillaService {
    @Autowired
    private VillaRepository villaRepository;


    @Override
    public List<Villa> findAll() {
        return (List<Villa>) villaRepository.findAll();
    }
}
