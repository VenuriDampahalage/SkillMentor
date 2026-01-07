package online.Skill_Mentor.repositories;

import online.Skill_Mentor.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionsRepo extends JpaRepository<Session, Long> {
}
