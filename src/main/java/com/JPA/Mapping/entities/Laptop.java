package com.JPA.Mapping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jpa_laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopId;
    private String modelNumber;
    private String brand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
