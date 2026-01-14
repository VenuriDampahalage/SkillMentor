package online.Skill_Mentor.services.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import online.Skill_Mentor.entities.Student;
import online.Skill_Mentor.repositories.StudentRepo;
import online.Skill_Mentor.services.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        if (studentRepository.existsById(id)) {
            return studentRepository.findById(id).get();
        }
        else{
            System.out.println("No such student exists");
        }
        return null;
    }

    @Override
    public Student createStudent(Student student) {
        if (studentRepository.existsById(student.getId())) {
            System.out.println("Student already exists");
        }
        else{
            Student newStudent = modelMapper.map(student, Student.class);
            return studentRepository.save(newStudent);
        }
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        if (studentRepository.existsById(id)) {
            Student oldStudent = studentRepository.findById(id).get();
        }
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
