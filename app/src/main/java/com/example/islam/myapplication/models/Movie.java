package com.example.islam.myapplication.models;

import java.io.Serializable;

public class Movie implements Serializable{
    private String name;
    private String image;

    private double rate;

    public Movie() {
    }

    public Movie(String name, String image, double rate) {
        this.name = name;
        this.image = image;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
