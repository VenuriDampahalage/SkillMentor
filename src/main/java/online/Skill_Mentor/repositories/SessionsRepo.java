package online.Skill_Mentor.repositories;

import online.Skill_Mentor.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionsRepo extends JpaRepository<Session, Long> {
}
