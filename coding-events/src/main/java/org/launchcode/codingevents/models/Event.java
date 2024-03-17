package org.launchcode.codingevents.models;

public class Event {

    private String name;
    private String descripiton;

    public Event(String name, String descripiton) {
        this.name = name;
        this.descripiton = descripiton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripiton() {
        return descripiton;
    }

    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }

    @Override
    public String toString() {
        return name;
    }
}
