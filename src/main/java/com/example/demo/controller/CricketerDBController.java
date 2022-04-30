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

    @RequestMapping(value = "update_cricketer_db/{name}/{id}", method = RequestMethod.PUT)
    public String update(@PathVariable String name, @PathVariable Integer id){
        Cricketer cricketer=repository.getById(id);
        cricketer.setName("Hansi Cronje");
        repository.save(cricketer);
        return "cricketer updated in DB successfully";
    }
    //Delete

    @RequestMapping(value = "delete_cricketer_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        repository.deleteById(id);
        return "cricketer deleted in Db successfully";


    }




}
