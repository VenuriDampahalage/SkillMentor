package online.Skill_Mentor.services;

import online.Skill_Mentor.entities.Subject;

import java.util.List;

//no usage = 1

public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
    Subject createSubject(Subject subject);
    Subject updateSubject(Long id, Subject subject);
    Subject patchSubject(Long id, Subject subject);
    void deleteSubject(Long id);
    List<Subject> getOrCreateSubjects(List<Subject> subjects);
}
