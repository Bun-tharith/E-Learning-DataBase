package kh.edu.istad.e_learning.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true , nullable = false)
    private  String icon;
    @Column(unique = true , nullable = false)
    private  Boolean is_deleted;
    @Column(unique = true , nullable = false , length = 50)
    private String name  ;

    @ManyToOne
    private  Enrollment enrollment;
}
