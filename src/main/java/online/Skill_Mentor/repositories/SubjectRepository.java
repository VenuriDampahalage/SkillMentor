package online.Skill_Mentor.repositories;

import online.Skill_Mentor.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
