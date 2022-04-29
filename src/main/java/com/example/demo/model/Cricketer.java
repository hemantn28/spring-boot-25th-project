package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cricketer {

    @Id
    @GeneratedValue
    int id;
    String name;
    String nation;
    int runs;
    String type;

    public Cricketer() {
    }

    public Cricketer(int id, String name, String nation, int runs, String type) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.runs = runs;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
