package com.registration.Prison.model;


import jakarta.persistence.*;

@Entity
@Table(name = "prisoners")
public class Prisoners {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String prisonerName;
    private int prisonerAge;
    private String prisonerCrime;

    public Prisoners() {
    }


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getPrisonerName() {
        return prisonerName;
    }

    public void setPrisonerName(String prisonerName) {
        this.prisonerName = prisonerName;
    }

    public int getPrisonerAge() {
        return prisonerAge;
    }

    public void setPrisonerAge(int prisonerAge) {
        this.prisonerAge = prisonerAge;
    }

    public String getPrisonerCrime() {
        return prisonerCrime;
    }

    public void setPrisonerCrime(String prisonerCrime) {
        this.prisonerCrime = prisonerCrime;
    }
}
