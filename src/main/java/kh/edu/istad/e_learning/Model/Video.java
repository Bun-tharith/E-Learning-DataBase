package kh.edu.istad.e_learning.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true , nullable = false)
    private  String duration ;
    @Column(unique = true , nullable = false)
    private Boolean is_deleted ;
    @Column(unique = true , nullable = false)
    private Boolean is_published ;
    @Column(unique = true, nullable = false)
    private  String slug;
    @Column( nullable = false)
    private  String thumbnail;
    @Column(nullable = false)
    private  String title;
    @Column(nullable = false)
    private  String youtube;
    @Column(unique = true , nullable = false)
    private Integer course_id;

    @ManyToOne
    private  Enrollment enrollment;

}
