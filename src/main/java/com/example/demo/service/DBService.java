package com.example.demo.service;

import com.example.demo.model.Cricketer;
import com.example.demo.repository.CricketerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    @Autowired
    CricketerRepository repository;
    public String add(Cricketer cricketer){

        repository.save(cricketer);

        return "cricketer added to DB successfully";

    }
}
