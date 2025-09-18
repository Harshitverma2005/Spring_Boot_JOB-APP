/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.springbootwebapp;

import org.springframework.stereotype.Component;

@Component
 public class Alien {
 private int alienid;
    private String alienname;
    public int getAlienId() {
        return alienid;
    }
    public void setAlienId(int alienid) {
        this.alienid = alienid;
    }
    public String getAlienName() {
        return alienname;
    }
    public void setAlienName(String alienname) {
        this.alienname = alienname;
    }
    @Override
    public String toString() {
        return "Alien{" + "alienid=" + alienid + ", alienname=" + alienname + '}';
    }

}
