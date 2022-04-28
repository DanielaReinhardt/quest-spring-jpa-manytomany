package com.wildcodeschool.wildandwizard.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
   
    //Modify the entity Course and add the code that would be required to create the relationship with a list of multiple student wizards: List<Wizard> wizards

    @ManyToMany(mappedBy = "courses")
    // FIX: private Wizard wizard; //darf da nicht stehen, da sonst das @ManytoMany sich darauf bezieht
    private List<Wizard> wizards; // FIX: =new ArrayList<>(); //andere Variablen werden auch nicht initialisiert

    public Course() {
    }

    
    public Course(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Wizard> getWizards(){
        return wizards;
    }
    public void setWizards(List<Wizard> wizards){
        this.wizards = wizards;
    }


}
