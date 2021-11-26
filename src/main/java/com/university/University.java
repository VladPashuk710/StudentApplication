package com.university;

import java.util.List;

public interface University {

    static void create(University student) {
    }

    static List<University> readAll() {
        return null;
    }

    static University read(int id) {
        return null;
    }


    static boolean update(University student, int id) {
        return false;
    }

    static boolean delete(int id) {
        return false;
    }

    void setStudent(int studentId);

}
