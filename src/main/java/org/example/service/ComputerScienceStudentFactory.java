package org.example.service;

import org.example.entity.Student;
import org.example.interfaces.StudentFactory;

public class ComputerScienceStudentFactory implements StudentFactory {

    @Override
    public Student createStudent() {
        return new BiologyStudent();
    }
}
