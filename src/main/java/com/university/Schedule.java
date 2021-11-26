package com.university;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class Schedule {

    private String Math;

    private String Ukrainian_Language;

    private String Ukrainian_Literature;

    private String History;

    private String Programming;

    private String Modeling;

    private String Physics;

    private String Economics;

    private String Philosophy;

   @Autowired

    public Schedule(String math, String ukrainian_Language, String ukrainian_Literature, String history, String programming, String modeling, String physics, String economics, String philosophy) {
        Math = math;
        Ukrainian_Language = ukrainian_Language;
        Ukrainian_Literature = ukrainian_Literature;
        History = history;
        Programming = programming;
        Modeling = modeling;
        Physics = physics;
        Economics = economics;
        Philosophy = philosophy;
    }

    public String getMath() {
        return Math;
    }

    public void setMath(String math) {
        Math = math;
    }

    public String getUkrainian_Language() {
        return Ukrainian_Language;
    }

    public void setUkrainian_Language(String ukrainian_Language) {
        Ukrainian_Language = ukrainian_Language;
    }

    public String getUkrainian_Literature() {
        return Ukrainian_Literature;
    }

    public void setUkrainian_Literature(String ukrainian_Literature) {
        Ukrainian_Literature = ukrainian_Literature;
    }

    public String getHistory() {
        return History;
    }

    public void setHistory(String history) {
        History = history;
    }

    public String getProgramming() {
        return Programming;
    }

    public void setProgramming(String programming) {
        Programming = programming;
    }

    public String getModeling() {
        return Modeling;
    }

    public void setModeling(String modeling) {
        Modeling = modeling;
    }

    public String getPhysics() {
        return Physics;
    }

    public void setPhysics(String physics) {
        Physics = physics;
    }

    public String getEconomics() {
        return Economics;
    }

    public void setEconomics(String economics) {
        Economics = economics;
    }

    public String getPhilosophy() {
        return Philosophy;
    }

    public void setPhilosophy(String philosophy) {
        Philosophy = philosophy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule)) return false;
        Schedule timetable = (Schedule) o;
        return getMath().equals(timetable.getMath()) &&
                getUkrainian_Language().equals(timetable.getUkrainian_Language()) &&
                getUkrainian_Literature().equals(timetable.getUkrainian_Literature()) &&
                getHistory().equals(timetable.getHistory()) &&
                getProgramming().equals(timetable.getProgramming()) &&
                getModeling().equals(timetable.getModeling()) &&
                getPhysics().equals(timetable.getPhysics()) &&
                getEconomics().equals(timetable.getEconomics()) &&
                getPhilosophy().equals(timetable.getPhilosophy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMath(), getUkrainian_Language(), getUkrainian_Literature(), getHistory(), getProgramming(), getModeling(), getPhysics(), getEconomics(), getPhilosophy());
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "Math='" + Math + '\'' +
                ", Ukrainian_Language='" + Ukrainian_Language + '\'' +
                ", Ukrainian_Literature='" + Ukrainian_Literature + '\'' +
                ", History='" + History + '\'' +
                ", Programming='" + Programming + '\'' +
                ", Modeling='" + Modeling + '\'' +
                ", Physics='" + Physics + '\'' +
                ", Economics='" + Economics + '\'' +
                ", Philosophy='" + Philosophy + '\'' +
                '}';

    }

}
