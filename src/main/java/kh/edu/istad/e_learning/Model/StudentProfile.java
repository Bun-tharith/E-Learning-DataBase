package kh.edu.istad.e_learning.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.cfg.Environment;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="student_profiles")
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true , nullable = false)
    private String biography;
    @Column(unique = true , nullable = false)
    private String facebook_link;
    @Column(unique = true , nullable = false)
    private String github_link;
    @Column(unique = true , nullable = false)
    private String major;
    @Column(unique = true , nullable = false)
    private String phone_number;
    @Column(unique = true , nullable = false)
    private String university;
    @ManyToOne
    private Enrollment enrollment;


}

