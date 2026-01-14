package online.Skill_Mentor.controllers.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import online.Skill_Mentor.entities.Student;
import online.Skill_Mentor.services.impl.StudentServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
@Data
public class StudentController {
    private final ModelMapper modelMapper;
    private final StudentServiceImpl studentService;

    //Read all
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    //Read by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    //Create
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    //Update
    @PutMapping("/{id}")
    public Student updateStudent(Long id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    //delete
    @DeleteMapping("/{id}")
    public void deleteStudent(Long id, @RequestBody Student student){
        studentService.deleteStudent(id);
    }
}
