package com.university;

import java.util.Objects;

public class StructureOfUniversity {

    private String students;

    private String audiences;

    private String groupes;

    private String chairs;

    private String deans;

    public StructureOfUniversity(String students, String audiences, String groupes, String chairs, String deans) {
        this.students = students;
        this.audiences = audiences;
        this.groupes = groupes;
        this.chairs = chairs;
        this.deans = deans;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public String getAudiences() {
        return audiences;
    }

    public void setAudiences(String audiences) {
        this.audiences = audiences;
    }

    public String getGroupes() {
        return groupes;
    }

    public void setGroupes(String groupes) {
        this.groupes = groupes;
    }

    public String getChairs() {
        return chairs;
    }

    public void setChairs(String chairs) {
        this.chairs = chairs;
    }

    public String getDeans() {
        return deans;
    }

    public void setDeans(String deans) {
        this.deans = deans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StructureOfUniversity)) return false;
        StructureOfUniversity that = (StructureOfUniversity) o;
        return Objects.equals(getStudents(), that.getStudents()) &&
                Objects.equals(getAudiences(), that.getAudiences()) &&
                Objects.equals(getGroupes(), that.getGroupes()) &&
                Objects.equals(getChairs(), that.getChairs()) &&
                Objects.equals(getDeans(), that.getDeans());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudents(), getAudiences(), getGroupes(), getChairs(), getDeans());
    }

    @Override
    public String toString() {
        return "StructureOfUniversity{" +
                "students='" + students + '\'' +
                ", audiences='" + audiences + '\'' +
                ", groupes='" + groupes + '\'' +
                ", chairs='" + chairs + '\'' +
                ", deans='" + deans + '\'' +
                '}';
    }

}
