package online.Skill_Mentor.repositories;

import online.Skill_Mentor.entities.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorsRepo extends JpaRepository<Mentor, Long> {
}
