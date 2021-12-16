package com.Tranzactions.Entity;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tempo")
public class Tempo {
    @Id
    @Generated(GenerationTime.INSERT)
    private int id;

    private String pname;

    public Tempo(int id, String pname) {
        this.id = id;
        pname = pname;
    }
    public Tempo(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpname() {
        return pname;
    }

    public void setpname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Tempo{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                '}';
    }
}
