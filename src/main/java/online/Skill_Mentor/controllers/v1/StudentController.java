package online.Skill_Mentor.controllers.v1;

import lombok.AllArgsConstructor;
import lombok.Data;
import online.Skill_Mentor.services.impl.StudentServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Data
public class StudentController {
    private final ModelMapper modelMapper;
    private final StudentServiceImpl studentService;

    //Read all
    //Read by id
    //Create
    //Update
    //delete
}
