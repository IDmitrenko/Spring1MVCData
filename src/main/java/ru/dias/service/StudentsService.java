package ru.dias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dias.entites.Student;
import ru.dias.repositories.StudentsRepository;

@Service
public class StudentsService {
    private StudentsRepository studentsRepository;

    @Autowired
    public void setStudentsRepository(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public Student getStudentById(int id) {
        Student student = studentsRepository.findOneById(id);
        return student;
    }

    public StudentsService() {

    }
}
