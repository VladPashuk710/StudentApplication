package com.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

public class StudentController {

    private final University student;

    @Autowired

    public StudentController(University university, University student) {
        this.student = student;
    }

    @PostMapping(value = "/students")

    public ResponseEntity<?> create(@RequestBody University student) {
        University.create(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/students")

    public ResponseEntity<List<University>> read() {
        final List<University> students = University.readAll();

        return students != null && !students.isEmpty()
                ? new ResponseEntity<>(students, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/students/{id}")

    public ResponseEntity<University> read(@PathVariable(name = "id") int id) {
        final University student = University.read(id);

        return student != null
                ? new ResponseEntity<>(student, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/students/{id}")

    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody University student) {
        final boolean updated = University.update(student, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/students/{id}")

    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = University.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}
