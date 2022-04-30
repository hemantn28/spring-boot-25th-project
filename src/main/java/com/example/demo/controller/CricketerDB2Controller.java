package com.example.demo.controller;

import com.example.demo.model.Cricketer;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CricketerDB2Controller {

    @Autowired
    DBService service;

    @RequestMapping(value = "add_cricketers_db", method = RequestMethod.POST)
    public String add(@RequestBody Cricketer cricketer) {

        return service.add(cricketer);
    }

}