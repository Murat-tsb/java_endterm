package com.company;


import java.util.List;
import java.util.UUID;

public interface IStudentRepository {
    boolean createStudent(Student student);
    boolean removeStudent(Student student);
    Student getStudent(UUID student_uuid);
    Student getStudent(String name);
    List<Student> getAllStudents();
}
