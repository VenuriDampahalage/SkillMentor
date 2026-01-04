package online.Skill_Mentor.repositories;

import online.Skill_Mentor.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
