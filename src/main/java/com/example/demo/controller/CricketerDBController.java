package com.example.demo.controller;

import com.example.demo.model.Cricketer;
import com.example.demo.repository.CricketerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CricketerDBController {

    //Create
    @Autowired
    CricketerRepository repository;

    @RequestMapping(value = "add_cricketer_db",method = RequestMethod.POST)
    public String add(@RequestBody Cricketer cricketer){
        repository.save(cricketer);
        return "cricketer added in DB successfully";
    }
    //get

    @RequestMapping(value = "get_cricketer_db", method = RequestMethod.GET)
    public List<Cricketer>getAll(){
        return repository.findAll();

    }

    //Update

    @RequestMapping(value = "update_cricketer_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name, @RequestParam Integer id){
        Cricketer cricketer=repository.getById(id);
        cricketer.setName("Robin Singh");
        repository.save(cricketer);
        return "cricketer updated in DB successfully";
    }
    //Delete

    @RequestMapping(value = "delete_cricketer_db",method = RequestMethod.DELETE)
    public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "cricketer deleted in Db successfully";


    }




}
