package org.launchcode.models;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {

    private String name;
    private int id;
    private List<Cheese> cheeses = new ArrayList<>();

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

    public List<Cheese> getCheeses() {
        return cheeses;
    }
}

