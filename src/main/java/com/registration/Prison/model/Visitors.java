package com.registration.Prison.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table( name = "visitor")
public class Visitors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String VisitorName;
    private String PrisonerName;
    private LocalDate VisitDate;
    private int Time;
    private String Relationship;

    public Visitors() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getVisitorName() {
        return VisitorName;
    }

    public void setVisitorName(String visitorName) {
        VisitorName = visitorName;
    }

    public String getPrisonerName() {
        return PrisonerName;
    }

    public void setPrisonerName(String prisonerName) {
        PrisonerName = prisonerName;
    }

    public LocalDate getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        VisitDate = visitDate;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public String getRelationship() {
        return Relationship;
    }

    public void setRelationship(String relationship) {
        Relationship = relationship;
    }
}
