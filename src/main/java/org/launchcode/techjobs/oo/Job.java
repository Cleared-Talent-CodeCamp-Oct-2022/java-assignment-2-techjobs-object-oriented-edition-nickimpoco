package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String aName, Employer anEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        name = (aName == null || aName.equals("") ? "Data not available" : aName);
        employer = anEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    @Override
    public String toString() {
        return  "\nID: " + id +
                "\nName: " + name +
                "\nEmployer: " + employer +
                "\nLocation: " + location +
                "\nPosition Type: " + positionType +
                "\nCore Competency: " + coreCompetency +
                "\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
}
