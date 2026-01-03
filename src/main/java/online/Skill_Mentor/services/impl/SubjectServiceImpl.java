package online.Skill_Mentor.services.impl;

import lombok.RequiredArgsConstructor;
import online.Skill_Mentor.dto.SubjectDTO;
import online.Skill_Mentor.entities.Subject;
import online.Skill_Mentor.repositories.SubjectRepository;
import online.Skill_Mentor.services.SubjectService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubjectById(Long id) {
        return null;
    }

    @Override
    public Subject createSubject(Subject subject) {
        Subject newSubject = subjectRepository.save(subject);
        return newSubject;
    }

    @Override
    public Subject updateSubject(Long id, Subject subject) {
        return null;
    }

    public Subject updateSubject(Long id, SubjectDTO subjectDTO) {
        Subject subject = getSubjectById(id);
        modelMapper.map(subjectDTO, subject);
        return subjectRepository.save(subject);
    }



    @Override
    public Subject patchSubject(Long id, Subject subject) {
        return null;
    }

    @Override
    public void deleteSubject(Long id) {

    }

    @Override
    public List<Subject> getOrCreateSubjects(List<Subject> subjects) {
        return List.of();
    }
}
