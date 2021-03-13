package com.company;

import java.util.List;

public class StudentController {
    private final IStudentRepository studentRepository;

    public StudentController(IStudentRepository repo) {
        this.studentRepository = repo;
    }

    public String createStudent(String name) {
        Student student = new Student(name);

        boolean created = false== studentRepository.createStudent(student); //calling repository method

        return (created ? "Student was created!" : "Student creation was failed!");
    }

    public String getStudent(String name) {
        Student student = studentRepository.getStudent(name);

        return (student == null ? "Student was not found!" : student.toString());
    }

    public String getAllStudents() {
        List<Student> students = studentRepository.getAllStudents();

        String allStudents = "";
        for(int i=0;i<students.size();i++) {
            allStudents = allStudents + (i+1) + ". " + students.get(i).toString() + "\n";
        }

        return allStudents;
    }

    public String removeStudent(String name) {
        Student student = new Student(name);

        boolean removed = false == studentRepository.removeStudent(student);
        return (removed? "Student was removed" : "Student removal was failed");
    }
}

