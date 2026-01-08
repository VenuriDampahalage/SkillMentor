package online.Skill_Mentor.services.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import online.Skill_Mentor.entities.Student;
import online.Skill_Mentor.repositories.StudentRepo;
import online.Skill_Mentor.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class StudentServiceImpl implements StudentService {
    
    private final StudentRepo studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

    @Override
    public Student patchStudent(Long id, Student newstudent) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }
}
