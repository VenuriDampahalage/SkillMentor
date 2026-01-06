package online.Skill_Mentor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Mentors")
public class Mentors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id; //1

    @Column(length = 100, nullable = false, unique = true)
    private String email; //2

    @Column(length = 100, nullable = false)
    private String first_Name; //3

    @Column(length = 100, nullable = false)
    private String last_Name; //4

    @Column(length = 100, nullable = false)
    private String profession; //5

    @Column(length = 100, nullable = false)
    private String company; //6

    @Column(nullable = false, updatable = true)
    private int experience_years; //7

    @Column(length = 1000, nullable = false)
    private String bio; //8

    @Column(name = "availability_Start", updatable = true)
    private LocalDateTime availability_Start; //9

    @Column(name = "availability_End", updatable = true)
    private LocalDateTime availability_End; //10

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt; //11

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt; //12

    //One Mentor belongs to many sessions
    @OneToMany(mappedBy = "mentor_id")
    private Collection<Sessions> sessions;

}
