package com.JPA.Mapping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentId;
    private String studentName;
    private String about;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Address> addressList = new ArrayList<>();
}
