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
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //1

    //Many payments belong to one session
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_id", nullable = false)
    private Session session_id; //2

    //Many payments belong to one student
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student_id; //3

    @Column
    private String reciept_url; //4

    @Column
    private String notes; //5

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime created_at; //6

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updated_at; //7
}
