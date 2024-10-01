package com.example.demo.model;

import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
public class Elev{
    private long id;
    private List<Nota> note;

    public Elev(long id, String nume, String prenume){
//        super(nume, prenume);
        this.id = id;
    }

//    public Long getId(){
//       return this.id;
//    }
}
