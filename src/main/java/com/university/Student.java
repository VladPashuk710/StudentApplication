package com.university;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Student implements University {

    private String firstname = "Vlad";

    private String lastname = "Pashuk";

    private UUID id = UUID.randomUUID();

    private int audience = 321;

    private String groupe = "AC0006";

    private String chair = "EVM";

    private String dean = "Technical kibernetics";

    public Student(String firstname, String lastname, UUID id, int audience, String groupe, String chair, String dean) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.audience = audience;
        this.groupe = groupe;
        this.chair = chair;
        this.dean = dean;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean;
    }

    public static Map<Integer, Student> getStudentRepositoryMap() {
        return STUDENT_REPOSITORY_MAP;
    }

    public static AtomicInteger getStudentIdHolder() {
        return STUDENT_ID_HOLDER;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAudience() == student.getAudience() &&
                getFirstname().equals(student.getFirstname()) &&
                getLastname().equals(student.getLastname()) &&
                getId().equals(student.getId()) &&
                getGroupe().equals(student.getGroupe()) &&
                getChair().equals(student.getChair()) &&
                getDean().equals(student.getDean());
    }

    @Override

    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getId(), getAudience(), getGroupe(), getChair(), getDean());
    }

    @Override

    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", audience=" + audience +
                ", groupe='" + groupe + '\'' +
                ", chair='" + chair + '\'' +
                ", dean='" + dean + '\'' +
                '}';
    }

    private static final Map<Integer, Student> STUDENT_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger STUDENT_ID_HOLDER = new AtomicInteger();

    public void create(University student) {
        final int studentId = STUDENT_ID_HOLDER.incrementAndGet();
        student.setStudent(studentId);
        STUDENT_REPOSITORY_MAP.put(studentId, (Student) student);
    }

    public List<University> readAll() {
        return new ArrayList<>(STUDENT_REPOSITORY_MAP.values());
    }

    public University read(int id) {
        return STUDENT_REPOSITORY_MAP.get(id);
    }

    public boolean update(University student, int id) {
        if (STUDENT_REPOSITORY_MAP.containsKey(id)) {
            student.setStudent(id);
            STUDENT_REPOSITORY_MAP.put(id, (Student) student);
        }

            return false;
    }

    public static boolean delete(int id) {
        return STUDENT_REPOSITORY_MAP.remove(id) != null;
    }

    public void setStudent(int studentId) {

    }

}
