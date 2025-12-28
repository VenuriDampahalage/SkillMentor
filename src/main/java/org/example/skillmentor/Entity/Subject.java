package org.example.skillmentor.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "subject")
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    @Column(length = 300, nullable = false)
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createAt;

    @Column(name = "updated_at")
    private Date updateAt;
}
