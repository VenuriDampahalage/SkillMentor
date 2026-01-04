package online.Skill_Mentor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne //Many payments belong to one session
    @JoinColumn(name = "session_id", nullable = false)
    private Sessions Session_id;

    @ManyToOne //Many payments belong to ONE student
    @JoinColumn(name = "student_id", nullable = false)
    private Student Student_id;

    @Column
    private String reciept_url;

    @Column
    private String notes;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime created_at;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updated_at;
}
