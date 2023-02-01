package org.launchcode.techjobs.oo;

import java.awt.*;
import java.util.Objects;

public abstract class JobField {
    private final int id;
    private static int nextId = 1;
    private String value;
    public JobField(){
        nextId++;
        id = nextId;
    }
    public JobField(String value){
        this();
        this.value = (value == null || value.equals("") ? "Data not available" : value);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField location = (JobField) o;
        return id == location.getId();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // no setter for getId intentional

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
