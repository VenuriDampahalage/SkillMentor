package online.Skill_Mentor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Mentors")
public class Mentors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String first_Name;

    @Column(length = 100, nullable = false)
    private String last_Name;

    @Column(length = 100, nullable = false)
    private String profession;

    @Column(length = 100, nullable = false)
    private String company;

    @Column(nullable = false, updatable = true)
    private int experience_years;

    @Column(length = 1000, nullable = false)
    private String bio;

    @Column(name = "availability_Start", updatable = true)
    private LocalDateTime availability_Start;

    @Column(name = "availability_End", updatable = true)
    private LocalDateTime availability_End;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

}
