package online.Skill_Mentor.repositories;

import online.Skill_Mentor.entities.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepo extends JpaRepository<Payments, Long> {
}
