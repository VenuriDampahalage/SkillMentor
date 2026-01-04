package online.Skill_Mentor.repositories;

import online.Skill_Mentor.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Long> {
}
