package online.Skill_Mentor.services;

import online.Skill_Mentor.entities.Mentor;

import java.util.List;

public interface MentorService {
    List<Mentor> getAllMentors();
    Mentor createMentor(Mentor mentor);
    Mentor getMentorById(Long id);
    Mentor updateMentor(Mentor mentor);
    Mentor patchMentor(Mentor mentor);
    void deleteMentorById(Long id);
    //void deleteMentor(Long id);
    List<Mentor> getOrCreate(List<Mentor> mentors);
}
