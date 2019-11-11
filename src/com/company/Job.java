package com.company;
public class Job {
    private String name;
    private String description;

    public Job() {//constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Job(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void displayText() {
        System.out.println("Name: " + name + "." + " Description: " + description);
    }
}
