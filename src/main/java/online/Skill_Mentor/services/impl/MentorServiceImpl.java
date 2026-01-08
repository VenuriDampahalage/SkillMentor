package online.Skill_Mentor.services.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import online.Skill_Mentor.entities.Mentor;
import online.Skill_Mentor.repositories.MentorsRepo;
import online.Skill_Mentor.services.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
public class MentorServiceImpl implements MentorService {

    private final MentorsRepo mentorsRepository;

    @Override
    public List<Mentor> getAllMentors() {
        return mentorsRepository.findAll();
    }

    @Override
    public Mentor getMentorById(Long id) {
        return null;
    }

    @Override
    public Mentor createMentor(Mentor mentor) {
         Mentor newmentor = mentorsRepository.save(mentor);
         return newmentor;
    }

    @Override
    public Mentor updateMentor(Long id, Mentor mentor) {
        if(mentorsRepository.existsById(id)){
            Mentor oldmentor = mentorsRepository.findById(id).get();
            oldmentor.setEmail(mentor.getEmail());
            oldmentor.setFirst_Name(mentor.getFirst_Name());
            oldmentor.setLast_Name(mentor.getLast_Name());
            oldmentor.setProfession(mentor.getProfession());
            oldmentor.setCompany(mentor.getCompany());
            oldmentor.setExperience_years(mentor.getExperience_years());
            oldmentor.setBio(mentor.getBio());
            oldmentor.setAvailability_Start(mentor.getAvailability_Start());
            oldmentor.setAvailability_End(mentor.getAvailability_End());

            return  mentorsRepository.save(oldmentor);
        }
        else{
            System.out.println("There is no such mentor");
        }
        return null;
    }

    //Check
    @Override
    public Mentor patchMentor(Mentor mentor) {
        return null;
    }

    @Override
    public void deleteMentorById(Long id) {
        if(mentorsRepository.existsById(id)){
            mentorsRepository.deleteById(id);
        }else{
            System.out.println("There is no such mentor");
        }

    }

    //Check
    @Override
    public List<Mentor> getOrCreate(List<Mentor> mentors) {
        return List.of();
    }
}
