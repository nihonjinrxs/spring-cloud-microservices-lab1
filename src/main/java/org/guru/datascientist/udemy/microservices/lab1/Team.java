package org.guru.datascientist.udemy.microservices.lab1;

/**
 * Created by ryan on 3/7/16.
 */
public class Team {

    Long id;
    String name;
    String location;
    String mascot;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }
}
