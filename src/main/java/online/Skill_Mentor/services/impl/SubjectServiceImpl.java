package online.Skill_Mentor.services.impl;

import lombok.RequiredArgsConstructor;
import online.Skill_Mentor.dto.SubjectDTO;
import online.Skill_Mentor.entities.Subject;
import online.Skill_Mentor.repositories.SubjectRepo;
import online.Skill_Mentor.services.SubjectService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepo subjectRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubjectById(Long id) {
        if (subjectRepository.existsById(id)) {
            return subjectRepository.findById(id).get();
        }
        else
            return null;
    }

    @Override
    public Subject createSubject(Subject subject) {
        Subject newSubject = modelMapper.map(subject, Subject.class);
        return subjectRepository.save(newSubject);
    }

    @Override
    public Subject updateSubject(Long id, Subject subject) {

        if (subjectRepository.existsById(id)) {
            Subject oldSubject = subjectRepository.findById(id).get();
            oldSubject.setName(subject.getName());

            return subjectRepository.save(oldSubject);
        }
        else{
            System.out.println("There is no such subject");
        }
        return null;
    }

    //Update only the fields that has been specified
    @Override
    public Subject patchSubject(Long id, Subject subject) {
        if (subjectRepository.existsById(id)) {
            patchSubject(id, subject);
        }
        else{
            System.out.println("There is no such subject");
        }
        return null;
    }


    @Override
    public void deleteSubject(Long id) {
        if (subjectRepository.existsById(id)) {
            subjectRepository.deleteById(id);
        }
        else{
            System.out.println("There is no such subject");
        }
    }

    @Override
    public List<Subject> getOrCreateSubjects(List<Subject> subjects) {

        List<Subject> newSubjects = new ArrayList<>();

        for(int i = 0; i < subjects.size(); i++){
            if(subjectRepository.existsById(subjects.get(i).getId())){
                newSubjects.add(subjects.get(i));
            }
            else{
                 Subject newSubject = subjectRepository.save(subjects.get(i));
                 newSubjects.add(newSubject);
            }
        }

        return newSubjects;
    }
}
