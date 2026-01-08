package online.Skill_Mentor.services;

import online.Skill_Mentor.entities.Mentor;

import java.util.List;

//no usage = 2

public interface MentorService {
    List<Mentor> getAllMentors();
    Mentor createMentor(Mentor mentor);
    Mentor getMentorById(Long id);
    Mentor updateMentor(Long id,Mentor mentor);
    Mentor patchMentor(Mentor mentor);
    void deleteMentorById(Long id);
    //void deleteMentor(Long id);
    List<Mentor> getOrCreate(List<Mentor> mentors);
}
