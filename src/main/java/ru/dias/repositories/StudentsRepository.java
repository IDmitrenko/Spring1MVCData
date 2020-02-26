package ru.dias.repositories;

import org.springframework.stereotype.Component;
import ru.dias.entites.Student;

@Component
public class StudentsRepository {

    public Student findOneById(int id) {
        Student student = new Student();
        student.setFirstName("Ivan " + id);
        student.setLastName("Ivanov " + id);
        return student;
    }
}
