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
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //1

    //Many Session belongs to One students
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    public Student student_id; //2

    //Many Session belongs to One Mentor
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "mentor_id")
    private Mentor mentor_id; //3

    //Many Sessions belong to one subject
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject_id; //4

    @Column(nullable = false, unique = true)
    private int session_at; //5

    @Column(nullable = false)
    private int duration_minutes; //6

    @Column(nullable = false)
    private String session_status; //7

    @Column(nullable = true)
    private String meeting_links; //8

    @Column(nullable = false)
    private String session_notes; //9

    @Column(length = 500, nullable = false, updatable = false)
    private String student_review; //10

    @Column(nullable = false, updatable = true)
    private int student_rating; //11

    @CreationTimestamp
    @Column(name = "session_rating")
    private LocalDateTime session_rating; //12

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt; //13

    //One session have one payment
    @OneToOne(mappedBy = "session_id")
    private Payment payment;
}
