package online.Skill_Mentor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Sessions")
public class Sessions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private int student_Id;

    @Column(nullable = false, unique = true)
    private int mentor_Id;

    @Column(nullable = false, unique = true)
    private int session_at;

    @Column(nullable = false)
    private int duration_minutes;

    @Column(nullable = false)
    private String session_status;

    @Column(nullable = true)
    private String meeting_links;

    @Column(nullable = false)
    private String session_notes;

    @Column(length = 500, nullable = false, updatable = false)
    private String student_review;

    @Column(nullable = false, updatable = true)
    private int student_rating;

    @CreationTimestamp
    @Column(name = "session_rating")
    private LocalDateTime session_rating;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
