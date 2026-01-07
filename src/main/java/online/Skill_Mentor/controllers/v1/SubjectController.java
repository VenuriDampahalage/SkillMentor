package online.Skill_Mentor.controllers.v1;

import lombok.RequiredArgsConstructor;
import online.Skill_Mentor.dto.SubjectDTO;
import online.Skill_Mentor.entities.Subject;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import online.Skill_Mentor.services.impl.SubjectServiceImpl;

import java.util.List;



/*URL mapping (@GetMapping, @PostMapping, …)

 HTTP verbs (GET, POST, PUT, PATCH, DELETE)

 Reading request data (@RequestBody, @PathVariable)

 Returning HTTP responses (ResponseEntity)

 Status codes (200, 201, 404, 400)*/


@RestController
@RequestMapping(path = "api/v1/subjects")
@RequiredArgsConstructor

public class SubjectController {

    private final ModelMapper modelMapper;
    private final SubjectServiceImpl subjectServiceImpl;


    //Get all subjects
    @GetMapping
    public List<Subject> getAllSubjects() {
        return  subjectServiceImpl.getAllSubjects();
    }

    //get subject by id
    @GetMapping("/{id}")
    public Subject getSubject(@RequestParam("id") Long id) {
        return subjectServiceImpl.getSubjectById(id);
    }

    //Create new subject
    @PostMapping
    public Subject createSubject(@Validated @RequestBody SubjectDTO newSubject) {
        Subject subject = modelMapper.map(newSubject, Subject.class);
        return subjectServiceImpl.createSubject(subject);
    }

    //Update Subject
    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable Long id, @Validated @RequestBody SubjectDTO newSubject) {
        Subject subject = modelMapper.map(newSubject, Subject.class);
        return subjectServiceImpl.updateSubject(id, subject);
    }

    //Delete Subject
    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectServiceImpl.deleteSubject(id);
    }



}









