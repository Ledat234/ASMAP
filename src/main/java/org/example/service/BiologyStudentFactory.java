package org.example.service;

import org.example.entity.Student;
import org.example.service.BiologyStudent;
import org.example.interfaces.StudentFactory;

public class BiologyStudentFactory implements StudentFactory {
    @Override
    public Student createStudent() {
        return new BiologyStudent();

    }
}
