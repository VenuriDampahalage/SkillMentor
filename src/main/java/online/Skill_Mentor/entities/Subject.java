package online.Skill_Mentor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Collection;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //1

    @Column(length = 100, nullable = false, unique = true)
    private String Name; //2

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt; //3

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt; //4

    //One Subject Belongs to Many Sessions
    @OneToMany(mappedBy = "subject_id")
    private Collection<Session> sessions;

}
