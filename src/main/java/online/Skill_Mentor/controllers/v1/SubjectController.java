package online.Skill_Mentor.controllers.v1;

import lombok.RequiredArgsConstructor;
import online.Skill_Mentor.dto.SubjectDTO;
import online.Skill_Mentor.entities.Subject;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import online.Skill_Mentor.services.impl.SubjectServiceImpl;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/subjects")
@RequiredArgsConstructor

public class SubjectController {

    private final ModelMapper modelMapper;
    private final SubjectServiceImpl subjectServiceImpl;


    @GetMapping
    public List<Subject> getAllSubjects() {
        return  subjectServiceImpl.getAllSubjects();
    }

    @PostMapping
    public Subject createSubject(@Validated @RequestBody SubjectDTO newSubject) {
        Subject subject = modelMapper.map(newSubject, Subject.class);
        return subjectServiceImpl.createSubject(subject);
    }
}









