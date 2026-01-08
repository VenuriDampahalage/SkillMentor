package online.Skill_Mentor.services;

import online.Skill_Mentor.entities.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    Student patchStudent(Long id, Student newstudent);
    void deleteStudent(Long id);
}
