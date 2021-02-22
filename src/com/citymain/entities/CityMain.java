package com.citymain.entities;

public class CityMain {

    int id;
    String name;
    int pepl;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getPepl() {
        return pepl;
    }

    public void setPepl(int pepl) {
        this.pepl = pepl;
    }

    @Override
    public String toString() {
        return "CityMain{" +
                "id='" +id + '\'' +
                ", name='" + name + '\'' +
                ", pepl=" + pepl +
                '}';
    }
}
