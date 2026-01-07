package online.Skill_Mentor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //1

    @Column(nullable = false)
    private String email; //2

    @Column(nullable = false)
    private String first_name; //3

    @Column(nullable = false)
    private String last_name; //4

    @Column(nullable = false)
    private String learning_goals; //5

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime created_at; //6

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updated_at;  //7

    //One student belongs to many sessions
    @OneToMany(mappedBy = "student_id")
    private Collection<Session> sessions;

    //One student have many payments
    @OneToMany(mappedBy = "student_id")
    private Collection<Payment> payments;

}
