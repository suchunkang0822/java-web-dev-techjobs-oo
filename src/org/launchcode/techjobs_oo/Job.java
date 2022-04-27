package org.launchcode.techjobs_oo;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.stream.Stream;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

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

    @Override
    public String toString(){
//
        if(Stream.of(name,employer,location,positionType,coreCompetency).allMatch(Objects::isNull)){
            return "OOPS! This job does not seem to exist.";
        }

//        String[] output = new String[6];
//        output[0] = id+"";
//        output[1] = returnValue(name);
//        output[2] = returnValue(employer);
//        output[3] = returnValue(location);
//        output[4] = returnValue(positionType);
//        output[5] = returnValue(coreCompetency);

        return "\n" +
                "ID: "+id+"\n"+
                "Name: "+returnValue(name)+"\n"+
                "Employer: "+returnValue(employer)+"\n"+
                "Location: "+returnValue(location)+"\n"+
                "Position Type: "+returnValue(positionType)+"\n"+
                "Core Competency: "+returnValue(coreCompetency)+"\n";
    }

    public String returnValue(Object o){

        if(o instanceof String){
            return (String)o;
        }else if(o instanceof Employer){
            return ((Employer)o).getValue();
        }else if(o instanceof Location){
            return ((Location)o).getValue();
        }else if(o instanceof PositionType){
            return ((PositionType)o).getValue();
        }else if(o instanceof CoreCompetency){
            return ((CoreCompetency)o).getValue();
        }
        return "Data not available";
    }



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
